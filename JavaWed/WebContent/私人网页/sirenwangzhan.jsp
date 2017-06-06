<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人网站</title>
</head>
<body>
	<%
		String name = request.getParameter("userName");
		String pw = request.getParameter("passWord");
		if ((name.equals("wuhualong")) && (pw.equals("123456"))) {		
		 response.setHeader("refresh","5;URL=sirenwangzhan2.html");
	%>
	<%-- <!-- 还有一种使用sendredirect()来实现跳转 -->
	     ${pageContext.response.setHeader("refresh,5;URL=sirenwangzhan2.html")}
	 --%>
	
	
     <jsp:forward page="tiaozhuan页面.html"/> 
	
	<%
		} else
	%>
	<jsp:forward page="../jspHTML.html/loginError.html"/>
</body>
</html>