<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String add="Bejing,Shanghai;Nanjin!Xian,Jinan";
request.setAttribute("add", add);
%>
<c:forTokens var="adde" items="${add}" delims=",;!" varStatus="status">
${status.count}、${adde}<br>
</c:forTokens>
<hr>
<c:forTokens var="app" items="${add}" delims=",;!" varStatus="status" begin="1" end="15" step="1" >
${status.count}、${app}<br>
</c:forTokens>
<hr>
<c:forTokens var="con" items="Li:Xing;Hua" delims=":;" varStatus="status">
${status.count}、${con}<br>
</c:forTokens>
</body>
</html>