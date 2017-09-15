<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.koala.rhschedule.constant.CommonConstants, com.koala.rhschedule.util.property.reader.ConfigurationReader" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<%
		/* Auth auth = new Auth(request, response);
		if (request.getParameter("attrs") == null) {
			auth.login();
		} else {
			String x = request.getPathInfo();
			auth.login("/java-saml-tookit-jspsample/attrs.jsp");
		} */
		
		String userRole=request.getParameter("userRole");
		System.out.println(userRole);
		response.sendRedirect(ConfigurationReader.getProperty(CommonConstants.SAML_IP_URL)+CommonConstants.SAML_LOGIN_BY_ROLE_URL+userRole);
		
	%>
</body>
</html>
