package com.spring.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.spring.model.Employee;

/**
 * The persistence interface for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 556823
 * @see EmployeePersistenceImpl
 * @see EmployeeUtil
 * @generated
 */
public interface EmployeePersistence extends BasePersistence<Employee> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the employee in the entity cache if it is enabled.
    *
    * @param employee the employee
    */
    public void cacheResult(com.spring.model.Employee employee);

    /**
    * Caches the employees in the entity cache if it is enabled.
    *
    * @param employees the employees
    */
    public void cacheResult(java.util.List<com.spring.model.Employee> employees);

    /**
    * Creates a new employee with the primary key. Does not add the employee to the database.
    *
    * @param empId the primary key for the new employee
    * @return the new employee
    */
    public com.spring.model.Employee create(long empId);

    /**
    * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param empId the primary key of the employee
    * @return the employee that was removed
    * @throws com.spring.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.spring.model.Employee remove(long empId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.spring.NoSuchEmployeeException;

    public com.spring.model.Employee updateImpl(
        com.spring.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee with the primary key or throws a {@link com.spring.NoSuchEmployeeException} if it could not be found.
    *
    * @param empId the primary key of the employee
    * @return the employee
    * @throws com.spring.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.spring.model.Employee findByPrimaryKey(long empId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.spring.NoSuchEmployeeException;

    /**
    * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param empId the primary key of the employee
    * @return the employee, or <code>null</code> if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.spring.model.Employee fetchByPrimaryKey(long empId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees.
    *
    * @return the employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.spring.model.Employee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.spring.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.spring.model.Employee> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.spring.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.spring.model.Employee> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees.
    *
    * @return the number of employees
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
