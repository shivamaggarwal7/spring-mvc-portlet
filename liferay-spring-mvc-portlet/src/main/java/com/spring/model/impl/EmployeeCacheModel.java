package com.spring.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.spring.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author 556823
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public long empId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String empName;
    public String grade;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{empId=");
        sb.append(empId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", empName=");
        sb.append(empName);
        sb.append(", grade=");
        sb.append(grade);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmpId(empId);
        employeeImpl.setGroupId(groupId);
        employeeImpl.setCompanyId(companyId);
        employeeImpl.setUserId(userId);

        if (userName == null) {
            employeeImpl.setUserName(StringPool.BLANK);
        } else {
            employeeImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            employeeImpl.setCreateDate(null);
        } else {
            employeeImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            employeeImpl.setModifiedDate(null);
        } else {
            employeeImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (empName == null) {
            employeeImpl.setEmpName(StringPool.BLANK);
        } else {
            employeeImpl.setEmpName(empName);
        }

        if (grade == null) {
            employeeImpl.setGrade(StringPool.BLANK);
        } else {
            employeeImpl.setGrade(grade);
        }

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        empId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        empName = objectInput.readUTF();
        grade = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(empId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (empName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(empName);
        }

        if (grade == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(grade);
        }
    }
}
