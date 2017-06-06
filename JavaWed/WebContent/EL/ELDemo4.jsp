<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
Cookie cookie=new Cookie("country","chn");
cookie.setMaxAge(120);
response.addCookie(cookie);
%>
</head>
<body>
<span>浏览器信息</span>${header['User-Agent'] }<br>
<span>${'${'}pageContext.session.id}:</span>${pageContext.session.id}<br>
//判断session是否为新的
<span>${'${'}pageContext.session.isNew()}:</span>${pageContext.session.isNew()}<br>
<span>${'${'}param.count}:</span>${param.count}<br>
<span>${'${'}param.count + 20}:</span>${param.count + 20 }
<%-- //获取xml里的<context-param>里的属性
${initParam.//在xml里的name }<br>
<%=(String)application.getInitParameter("//在xml里的name") %> --%>
<hr>
<h2>获取cookie:</h2>
<%-- ${cookie.country.name}<br>
${cookie.country.value}<br> --%>
${cookie['country'].name}<br>
${cookie['country'].value}<br>

</body>
</html>