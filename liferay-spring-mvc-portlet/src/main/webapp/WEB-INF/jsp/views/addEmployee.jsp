<%@ include file="/html/init.jsp" %>

<portlet:renderURL var="listContactsURL">
</portlet:renderURL>

<portlet:actionURL var="createEmpURL" name="createEmp" escapeXml="false">
</portlet:actionURL>


<form:form id="empForm" modelAttribute="empBean"  action="${createEmpURL}" method="POST" cssClass="form-horizontal">
	
    <!-- <div class="control-group">
        <label class="control-label" for="empId">Employee Id</label>
        <div class="controls">-->
           <form:input type="hidden" id="empId" path="empId" />
          <%--    <form:errors path="empId" cssClass="text-error" />
        </div>
    </div> --%>
    <div class="control-group">
        <label class="control-label" for="empName">Employee Name</label>
        <div class="controls">
            <form:input type="text" id="empName" path="empName" />
             <form:errors path="empName" cssClass="text-error" />
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="grade">Grade</label>
        <div class="controls">
            <form:input type="text" id="grade" path="grade" />
            <form:errors path="grade" cssClass="text-error" />
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
             <c:choose> 
			  <c:when test="${empBean.empId == 0}">
                <input id="validateNewEmployeeButton" class="btn btn-primary" type="submit" value="Create"/>
			 </c:when>
            <c:otherwise>
                <input id="validateUpdateContactButton" class="btn btn-primary" type="submit" value="Update"/>
            </c:otherwise>    
            </c:choose>
            
            <a href="${listContactsURL}" class="btn">Cancel</a>
        </div>
    </div>
  </form:form>