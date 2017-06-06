<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>importDemo</title>
</head>
<body>

<%-- <c:import var="import2" url="redirectDemo.jsp"  scope="session" charEncoding="UTF-8" />
  ${import2} --%>
<!--   跳转页面使用redirect -->
 <%-- <c:redirect url="redirectDemo.jsp" />  --%>
 <c:import var="baidu" url="http://www.baidu.com" scope="page" charEncoding="UTF-8"></c:import>
   ${baidu}
</body>
</html>