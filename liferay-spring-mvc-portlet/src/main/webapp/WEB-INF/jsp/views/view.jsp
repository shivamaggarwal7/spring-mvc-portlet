
<%@ include file="/html/init.jsp" %>

<portlet:renderURL var="addEmp">
<portlet:param name="action" value="addEmployeeView"/>
</portlet:renderURL>



<a href="${addEmp}">Add Employee</a>

<%
List<Employee> empList ;
int count= EmployeeLocalServiceUtil.getEmployeesCount();
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage", "/WEB-INF/jsp/views/view.jsp");
%>

<lui:search-container total="<%=count %>"
 delta="4" emptyResultsMessage="Sorry. There are no items to display." 
iteratorURL="<%=iteratorURL %>">
<%
empList=EmployeeLocalServiceUtil.getEmployees(searchContainer.getStart(), searchContainer.getEnd());
%>

<lui:search-container-results total="<%=count%>" results='<%=empList%>'/>

<lui:search-container-row className="Employee" modelVar="emp" >

<portlet:renderURL var="editEmp">
<portlet:param name="action" value="editEmployeeView"/>
<portlet:param name="empId" value="${emp.empId}"/>
</portlet:renderURL>

<lui:search-container-column-text name="Employee Name" property="empName" href="${editEmp}"/>
<lui:search-container-column-text name="Grade" property="grade"/>
</lui:search-container-row>
<lui:search-iterator searchContainer="<%=searchContainer %>"/>
</lui:search-container>

