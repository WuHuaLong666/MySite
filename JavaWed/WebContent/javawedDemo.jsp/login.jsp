<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp：forward事例</title>
</head>
<body>
<form action="loginRecelive.jsp" method="post">
<p>用户名：</p>
<input name="userName" type="text" size="12"/>
<br>
<p> 密码：</p>
<input name="passWord" type="text" size="12"/>
<br>
<input type="submit" name="se" value="提交"/>
<input type="reset" name="qw" value="重置"/>
</form>
</body>
</html>