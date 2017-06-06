<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录页面！！</title>
</head>
<body>
<form action='<%=request.getContextPath()%>/com.javaWeb.Servlet/ServletDemo.java'>
  用户名：<input type="text"  name="userName"><br>
  密    码 ：<input type="text"  name="password"><br>
</form>
<input type="submit" name="submit" value="提交">
<input type="reset"  name="reset" value="重置">
</body>
</html>