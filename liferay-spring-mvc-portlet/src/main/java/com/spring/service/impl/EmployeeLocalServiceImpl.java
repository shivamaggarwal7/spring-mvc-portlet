package com.spring.service.impl;

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
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.spring.service.EmployeeLocalServiceUtil} to access the employee local service.
     */
}
