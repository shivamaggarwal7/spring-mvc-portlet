package com.spring.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author 556823
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("empId", getEmpId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("empName", getEmpName());
        attributes.put("grade", getGrade());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long empId = (Long) attributes.get("empId");

        if (empId != null) {
            setEmpId(empId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String empName = (String) attributes.get("empName");

        if (empName != null) {
            setEmpName(empName);
        }

        String grade = (String) attributes.get("grade");

        if (grade != null) {
            setGrade(grade);
        }
    }

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the emp ID of this employee.
    *
    * @return the emp ID of this employee
    */
    @Override
    public long getEmpId() {
        return _employee.getEmpId();
    }

    /**
    * Sets the emp ID of this employee.
    *
    * @param empId the emp ID of this employee
    */
    @Override
    public void setEmpId(long empId) {
        _employee.setEmpId(empId);
    }

    /**
    * Returns the group ID of this employee.
    *
    * @return the group ID of this employee
    */
    @Override
    public long getGroupId() {
        return _employee.getGroupId();
    }

    /**
    * Sets the group ID of this employee.
    *
    * @param groupId the group ID of this employee
    */
    @Override
    public void setGroupId(long groupId) {
        _employee.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this employee.
    *
    * @return the company ID of this employee
    */
    @Override
    public long getCompanyId() {
        return _employee.getCompanyId();
    }

    /**
    * Sets the company ID of this employee.
    *
    * @param companyId the company ID of this employee
    */
    @Override
    public void setCompanyId(long companyId) {
        _employee.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this employee.
    *
    * @return the user ID of this employee
    */
    @Override
    public long getUserId() {
        return _employee.getUserId();
    }

    /**
    * Sets the user ID of this employee.
    *
    * @param userId the user ID of this employee
    */
    @Override
    public void setUserId(long userId) {
        _employee.setUserId(userId);
    }

    /**
    * Returns the user uuid of this employee.
    *
    * @return the user uuid of this employee
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee.getUserUuid();
    }

    /**
    * Sets the user uuid of this employee.
    *
    * @param userUuid the user uuid of this employee
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _employee.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this employee.
    *
    * @return the user name of this employee
    */
    @Override
    public java.lang.String getUserName() {
        return _employee.getUserName();
    }

    /**
    * Sets the user name of this employee.
    *
    * @param userName the user name of this employee
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _employee.setUserName(userName);
    }

    /**
    * Returns the create date of this employee.
    *
    * @return the create date of this employee
    */
    @Override
    public java.util.Date getCreateDate() {
        return _employee.getCreateDate();
    }

    /**
    * Sets the create date of this employee.
    *
    * @param createDate the create date of this employee
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _employee.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this employee.
    *
    * @return the modified date of this employee
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _employee.getModifiedDate();
    }

    /**
    * Sets the modified date of this employee.
    *
    * @param modifiedDate the modified date of this employee
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _employee.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the emp name of this employee.
    *
    * @return the emp name of this employee
    */
    @Override
    public java.lang.String getEmpName() {
        return _employee.getEmpName();
    }

    /**
    * Sets the emp name of this employee.
    *
    * @param empName the emp name of this employee
    */
    @Override
    public void setEmpName(java.lang.String empName) {
        _employee.setEmpName(empName);
    }

    /**
    * Returns the grade of this employee.
    *
    * @return the grade of this employee
    */
    @Override
    public java.lang.String getGrade() {
        return _employee.getGrade();
    }

    /**
    * Sets the grade of this employee.
    *
    * @param grade the grade of this employee
    */
    @Override
    public void setGrade(java.lang.String grade) {
        _employee.setGrade(grade);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(com.spring.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.spring.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public com.spring.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public com.spring.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
