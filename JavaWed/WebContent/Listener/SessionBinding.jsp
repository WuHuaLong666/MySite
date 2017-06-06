<%@page import="com.javaWeb.Servlet.Listener.SessionBindingDemo"%>
<%@page import="com.javaWeb.Servlet.Listener.SessionDemo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.javaWeb.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SessionBindingDemo</h1>
<%//javabean不能触发监听器
   bookDemo book=new bookDemo("javaweb",26);
   session.setAttribute("bookDemo",book);
   
   SessionBindingDemo se=new SessionBindingDemo("wangwu");
   session.setAttribute("SessionDemo", se);
%>
</body>
</html>