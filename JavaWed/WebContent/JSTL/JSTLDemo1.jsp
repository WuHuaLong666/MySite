<%@ page language="java" contentType="text/html; charset=UTF-8"  import="com.javaWeb.*"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTLDemo</title>
</head>
<body>
	<jsp:useBean id="student" class="com.javaWeb.bookDemo"  scope="page"/>
	<c:catch var="error">
		<c:set var="count" value="${param.c+1}" scope="page"></c:set>
删除之前，变量count的值为：<c:out value="${count}"></c:out>
		<br>
		<c:remove var="count" scope="page" />
删除之后，变量count的值为：<c:out value="${count}"></c:out>
		<br>
	</c:catch>
	<c:set value="limei" target="${student}" property="bookName"></c:set>

	<c:out value="${student.bookName}"></c:out>
	<br>
	<c:out value="${error}"></c:out>
</body>
</html>