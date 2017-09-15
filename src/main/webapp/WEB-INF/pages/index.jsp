<%@page import="com.mkyong.controller.App"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.mkyong.controller.App" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>Hello World Application</h1>
<%
System.out.println("Hi");
out.println("Hi from JSP");
App app=new App();
String test=app.test();
System.out.println("Hi");
out.println("Hi from JSP");
System.out.println(test);
out.println("File Name"+test);
out.println("Hi from JSP");

%>
 
HELLO WORLD  
</body>
</html>
