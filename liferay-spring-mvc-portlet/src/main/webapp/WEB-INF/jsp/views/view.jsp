<%@ include file="/html/init.jsp" %>

<portlet:renderURL var="addEmp">
<portlet:param name="action" value="addEmployeeView"/>
</portlet:renderURL>

<c:if test="${not empty empList}">
List is there ${empList}
</c:if><br>
<a href="${addEmp}">Add Employee</a>