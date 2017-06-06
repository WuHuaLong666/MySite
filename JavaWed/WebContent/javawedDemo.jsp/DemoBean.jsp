<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="com.javaWeb.*"%>
<jsp:useBean id="book" class="com.javaWeb.bookDemo" scope="page">
	<jsp:setProperty name="book" property="bookName" />
	<jsp:setProperty name="book" property="bookNum"  />
</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>javaBean事例</title>
</head>
<body>
	<h1 style="color: teal;">订购图书清单</h1>
	<hr style="height:30px ;"color=red;>
	<%=book.getBookName()%><br>
	<%=book.getBookNum()%><br>

</body>
</html>