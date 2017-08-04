# spring-mvc-portlet
Basic spring mvc portlet in liferay

* Unlike a single controller for all actions in a portlet,a spring mvc portlet consists of 

1. DispatcherPortlet,which acts as front controller,delegating requests to
2. Mapping Handler which subsequently delegates it to other controllers,based on the request mapping or directly,
3. View Resolvers,which map to the subsequent 
4. View

