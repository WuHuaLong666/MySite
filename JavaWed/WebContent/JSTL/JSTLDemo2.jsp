<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTLDemo2</title>
</head>
<body>
<form method="post">
请输入百分制成绩：<input type="text"name="score"/>
<input type="submit" value="提交"/>
<input type="reset" value="重置"/>
</form>
<c:set var="color" value="red"></c:set>

<c:set var="n" value="${param.score+0}"></c:set>
<c:if test="${n>=60.0}">
<c:set var="color" value="blue"/>
</c:if>
<font color="${color}" size="7">
<c:choose>
<c:when test="${n>100.0||n<0.0}">
您输入的是错误数字,请重新输入数字！！
</c:when>
<c:when test="${n>=90.0}">
您的成绩非常好，继续保持哦！！
</c:when>
<c:when test="${n>=80.0&&n<90.0}">
您的成绩好，继续加油哦！！
</c:when>
<c:when test="${n>=70.0&&n<80.0}">
您的成绩不错，继续加油哦！！
</c:when>
<c:when test="${n>=60.0&&n<70.0}">
您的成绩一般，要努力哦！！
</c:when>
<c:otherwise>
您的成绩不好哦！别灰心相信自己下次一定行！加油！
</c:otherwise>
</c:choose>
</font>
</body>
</html>