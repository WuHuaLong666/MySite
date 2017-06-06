<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forEachDemo</title>
</head>
<body>
	<%
		String[] books = { "JAVA Web程序设计", "操作系统", "JAVA语言程序设计", "C语言程序设计" };
		request.setAttribute("books", books);
	%>
	全部书目：
	<br>
	<c:forEach var="bookName" items="${books}">
${bookName }<br />
	</c:forEach>
	显示从10到15的整数值：
	<br>
	<c:forEach var="i" begin="10" end="15" step="3">
${i}&nbsp;
</c:forEach>
	<!-- forEach List集合事例  -->
	<%
		//定义集合
		List all = new ArrayList();
		all.add("MLDN");
		all.add("LiXingHua");
		all.add("www.MLDNJAVA.cn");
		pageContext.setAttribute("red", all);
	%>
	<h3>
		输出全部：
		<c:forEach items="${red}" var="mem">
  ${mem}
</c:forEach>
	</h3>
	<hr>
	<!-- forEach Map集合事例 -->
	<%
	//定义集合
	Map map=new HashMap();//实例化集合对象
	map.put("mldn", "www.MLDNJAVA.cn");
	map.put("lxh", "LiXiaoLong");
	//将数组保存在page范围中
	pageContext.setAttribute("ref", map);
	%>
	<c:forEach items="${ref}" var="em">
	<h2>${em.key}--->${em.value}</h2>
	</c:forEach>
</body>
</html>