<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>ListenerDemo</h2>
<%
   request.setAttribute("userName","lisi");//第一次是触发属性增强事件
   request.setAttribute("userName", "zhangsan");//第二次处罚属性增强事件
   request.removeAttribute("userName");//删除指定属性
%>
</body>
</html>