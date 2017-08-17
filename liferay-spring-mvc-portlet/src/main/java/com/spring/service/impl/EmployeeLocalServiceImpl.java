package com.spring.service.impl;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import com.liferay.portal.kernel.exception.SystemException;
import com.spring.InvalidDateException;
import com.spring.model.Employee;
import com.spring.service.base.EmployeeLocalServiceBaseImpl;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.spring.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author 556823
 * @see com.spring.service.base.EmployeeLocalServiceBaseImpl
 * @see com.spring.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
    
	public Employee createEmployee(com.spring.beans.Employee emp) throws SystemException
	{
		long empId =counterLocalService.increment();
		
		Employee employee= employeePersistence.create(empId);
		employee.setEmpName(emp.getEmpName());
		employee.setGrade(emp.getGrade());
		employee.setCreateDate(new Date());
		
		return employeePersistence.update(employee);
	}
	
	public Employee updateEmployee(com.spring.beans.Employee emp) throws SystemException, InvalidDateException
	{
		Employee employee= employeeLocalService.fetchEmployee(emp.getEmpId());
		 LocalDate businessdate= LocalDate.of(2017, 01, 15);
		
		employee.setEmpName(emp.getEmpName());
		employee.setGrade(emp.getGrade());
		employee.setModifiedDate(new Date());
		
		if(employee.getModifiedDate().after(java.sql.Date.valueOf(businessdate)))
		{
			throw new InvalidDateException("Inconsistent created and modified date");
		}
		
		
		return employeePersistence.update(employee);
	}
}
     
