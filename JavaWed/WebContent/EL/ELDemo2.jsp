<%@page import="java.util.TreeSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	//List
	List<String> list = new ArrayList<String>();
	list.add("abc");
	list.add("cda");
	list.add("him");
	list.add("asf");
	pageContext.setAttribute("list", list);
	//Set
	Set<String> set = new HashSet<String>();
	set.add("zse");
	set.add("rfv");
	set.add("yhn");
	set.add("mju");
	set.add("xcv");
	pageContext.setAttribute("set", set);
	//Map
	Map<String, String> map = new HashMap<String, String>();
	map.put("12", "AA12 ");
	map.put("13", "BB13 ");
	map.put("14", "CC14 ");
	map.put("15", "DD15 ");
	pageContext.setAttribute("map", map);
	//数组
	String[] string = { "qwe", "asd", "zxc", "edc" };
	pageContext.setAttribute("string", string);
%>
</head>
<%
	//pageContext.setAttribute("color", "red");
	request.setAttribute("color", "blue");
	session.setAttribute("color", "yello");
	application.setAttribute("color", "pink");
%>
<body bgcolor=${bgcolor.pinke}>
	//List获取数组 ${list}
	<p>${'${'}list[0]}:</p>${list[0]}
	<%-- <p>${'${'}list['abc']}:</p>${list['abc']} --%>
	<%-- <p>${'${'}list.abc}:</p>${list.abc }
 --%>	<p>${'${'}listget(0)}:</p>${list.get(0)}
	<p>List只能通过索引获取</p>
	<hr>
	//Set目前无法直接获取其中的元素！ ${set}
	<%-- <p>${'${'}set[0]}:</p>${set[0]} --%>
	<%-- <p>${'${'}set["zse"]}:</p>${set["zse"]} --%>
	<hr>
	//Map 获取元素是通过键Key！
	<p>${'${'}map}:</p>${map}
	<%-- <p>${'${'}map.12}:</p>${map.12} --%>
	<p>${'${'}map[13]}:</p>${map[13] }
	<p>${'${'}map[0]}:</p>${map[0]}
	<p>${'${'}map["14"]}:</p>${map["14"]}
	<hr>
	//数组获取
	 ${strArray}
	<p>${'${'}string[0]}:</p>${string[0]}
	<p>${'${'}string[1]}:</p>${string[1]}
	<%-- <p>${'${'}string.qwe}:</p>${string.qwe} --%>
	<p>${'${'}string["3"]}:</p>${string["3"]}
	<p>数组的取值，只能使用[]和索引来取值！</p>
	<hr>



	<h1>测试</h1>
	${5 * 5}
	<h1>启用表达式语言</h1>
	<form method="post" action="ELDemo3.jsp">
		<b>${'name:'}<input type="text" value="${'请输入你的名字'}" /></b><br> <b>${'lastname:'}<input
			type="text" value="${'请输入您的姓氏'}" /></b><br> <input type="submit"
			name="Submit" value="${'提交'}" /> <input type="reset" name="reset"
			value="${'重置'}" />
	</form>
</body>
</html>