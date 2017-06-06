<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>formatDateDemo</title>
</head>
<body>
	<jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
	<c:out value="${date}"></c:out>
	<br>
	<fmt:formatDate value="${date}" />
	<br>
	<fmt:formatDate value="${date}" pattern="yyyy/MM/dd HH:mm:ss:ss" />
</body>
</html>