<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="lui"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.spring.model.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.spring.service.EmployeeLocalServiceUtil"%>

<portlet:defineObjects />