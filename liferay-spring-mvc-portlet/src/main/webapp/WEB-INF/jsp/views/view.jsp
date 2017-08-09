<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<portlet:defineObjects />

<portlet:renderURL var="addEmp">
<portlet:param name="action" value="addEmployee"/>
</portlet:renderURL>

<a href="${addEmp}">Add Employee</a>