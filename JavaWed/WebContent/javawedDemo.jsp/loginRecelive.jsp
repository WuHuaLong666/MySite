<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		if ((name.equals("wuhualong")) && (pwd.equals("123456"))) {
	%>
	<jsp:forward page="../jspHTML.html/loginCorrect.html"></jsp:forward>

	<%
		} else
	%>
	<jsp:forward page="../jspHTML.html/loginError.html"></jsp:forward>

</body>
</html>