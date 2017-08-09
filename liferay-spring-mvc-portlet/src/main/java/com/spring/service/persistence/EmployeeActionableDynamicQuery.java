package com.spring.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.spring.model.Employee;

import com.spring.service.EmployeeLocalServiceUtil;

/**
 * @author 556823
 * @generated
 */
public abstract class EmployeeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmployeeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EmployeeLocalServiceUtil.getService());
        setClass(Employee.class);

        setClassLoader(com.spring.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("empId");
    }
}
