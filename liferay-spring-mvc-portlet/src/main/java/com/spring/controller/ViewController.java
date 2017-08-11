package com.spring.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.spring.beans.Employee;
import com.spring.service.EmployeeLocalServiceUtil;

@Controller
@RequestMapping("VIEW")
public class ViewController {

	private static final Log log = LogFactoryUtil.getLog(ViewController.class);

	@Autowired
	Employee employee;

	@RenderMapping
	public ModelAndView home(RenderRequest req, RenderResponse res, Model model) {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("view");

		return modelAndView;

	}

	@RenderMapping(params = "action=addEmployeeView")
	public ModelAndView addEmployee(RenderRequest req, RenderResponse res, Model model) {

		ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);

		log.info(themeDisplay.getUser());
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("addEmployee");
		modelAndView.addObject("empBean", employee);

		return modelAndView;

	}

	@RenderMapping(params = "action=editEmployeeView")
	public ModelAndView editEmployee(RenderRequest req, RenderResponse res, Model model) {

		long empId = ParamUtil.getLong(req, "empId");
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("addEmployee");
		com.spring.model.Employee emp = null;
		try {
			emp = EmployeeLocalServiceUtil.fetchEmployee(empId);
		} catch (SystemException e) {

			log.info("No employee for this user id");
		}
		modelAndView.addObject("empBean", new Employee(empId, emp.getEmpName(), emp.getGrade()));

		return modelAndView;

	}

	@ActionMapping
	public void createEmp(@ModelAttribute("empBean") @Valid Employee emp, BindingResult bindingResult,
			ActionRequest req, ActionResponse res) {
		if (bindingResult.hasErrors()) {

			res.setRenderParameter("action", "addEmployeeView");
		} else {
			if (emp.getEmpId() == 0) {

				try {
					EmployeeLocalServiceUtil.createEmployee(emp);
				} catch (SystemException e) {
					log.info("Something went bad while persisting entity");
				}
			} else {

				try {
					EmployeeLocalServiceUtil.updateEmployee(emp);
				} catch (SystemException e) {

					log.info("Something went bad while persisting entity");
				}
			}

		}

	}

}
