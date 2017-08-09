package com.spring.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.spring.beans.Employee;

@Controller
@RequestMapping("VIEW")
public class ViewController {

	private static final Log log = LogFactoryUtil.getLog(ViewController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RenderMapping
	public ModelAndView home(RenderRequest req, RenderResponse res, Model model) {

		ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);

		log.info(themeDisplay.getUser());
		ModelAndView modelAndView = new ModelAndView();

	    modelAndView.setViewName("view");
	  
	    return modelAndView;
	    
	}
	
	@RenderMapping(params= "action=addEmployee")
	public ModelAndView addEmployee(RenderRequest req, RenderResponse res, Model model) {

		ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);

		log.info(themeDisplay.getUser());
		ModelAndView modelAndView = new ModelAndView();

	    modelAndView.setViewName("addEmployee");
	    modelAndView.addObject("empBean",new Employee((long)5567, "Shivam"));
	  
	    return modelAndView;
	    
	}
	
	@ActionMapping	
		public void createEmp(@ModelAttribute("empBean") @Valid Employee emp, BindingResult bindingResult,ActionRequest req,ActionResponse res)
	{
		if(bindingResult.hasErrors())
		{
			
		res.setRenderParameter("action", "addEmployee");	
		}
		else
		{
			 System.out.println(bindingResult.hasErrors());
				
			System.out.println("------------->"+emp);
				
		}
       
	}

}
