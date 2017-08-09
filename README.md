# spring-mvc-portlet
Basic spring mvc portlet in liferay

- Unlike a single controller for all actions in a generic portlet,a spring mvc portlet consists of: 
  - **DispatcherPortlet**,which acts as front controller,delegating requests to,
  - **Mapping Handler** which subsequently delegates it to other controllers,based on the request mapping or directly to,
  - **View Resolvers**,which map to the subsequent 
  - **View**

- Spring framework provides usage of Forms,data binding and Validation framework
- Provides exception resolvers and interceptors

# Configuring a spring portlet

- Configuration in web.xml
	- Set portlet application context used by all portlets within a web app
	- Set ContextLoaderListener to load the parent context
	- Set contextConfigLocation for listing of bean definitions
	- Set ViewRendererServlet which acts as bridge between Servlet and Portlet requests
- Configuration in portlet.xml
	- Front Controller as DispatacherPortlet
	- Portlet's own contextConfigLocation
	- Bean definitions for a certain portlet are defined per portlet application context file while the ones
	  shared between portlets should in a parent file
 - The DispatcherPortlet uses HandlerMappings to determine which Controller should handle each PortletRequest.
 -  A DispatcherPortlet can use multiple HandlerMappings
	  
	  
	  
	  
	  
	  
	  
	  
	  References:
	  https://wiki.jasig.org/download/attachments/6619258/spring-portlet-mvc-tutorial_v1.pdf
	  https://wiki.jasig.org/download/attachments/25362440/spring-portlet-mvc-seminar.pdf

