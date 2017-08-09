package com.spring.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
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
		
		return employeePersistence.update(employee);
	}
}
     