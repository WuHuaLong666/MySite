<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ELDemo3</title>
</head>
<body>
<h2>基本运算符</h2>
<span>${'${'}5*3}=</span>${5*3}<br>
<span>${'${'}5/3}=</span>${5/3}<br>
<span>${'${'}5 div 3}=</span>${5 div 3}<br>
<span>${'${'}5+3}=</span>${5+3}<br>
<span>${'${'}5-3}=</span>${5-3}<br>
<hr>
<h2>关系运算符</h2>
<span>${'${'}5<3}=</span>${5<3}<br>
<span>${'${'}5lt3}=</span>${5 lt 3}<br>
<span>${'${'}5>3}=</span>${5>3}<br>
<span>${'${'}5gt3}=</span>${5 gt 3}<br>
<span>${'${'}5<=3}=</span>${5<=3}<br>
<span>${'${'}5le3}=</span>${5 le 3}<br>
<span>${'${'}5>=3}=</span>${5>=3}<br>
<span>${'${'}5ge3}=</span>${5 ge 3}<br>
<span>${'${'}5==3}=</span>${5==3}<br>
<span>${'${'}5eq3}=</span>${5 eq 3}<br>
<span>${'${'}5!=3}=</span>${5!=3}<br>
<hr>
<h2>逻辑运算符</h2>
<span>${'${'}true&&true}=</span>${true&&true}<br>
<span>${'${'}true and true}=</span>${true and false}<br>
 <span>${'${'}true||true}=</span>${true || true}<br>
 <span>${'${'}false or true}=</span>${false or true}<br>
 <hr>
 <h2>空值运算符</h2>
 ${empty "asd" }<br>
 ${empty "" }<br>
 <hr>
 <h3>三目运算符</h3>
 <span>${'${'}!A?0:1 }=</span>${!A? 0:1 }<br>
  <span>${'${'}A==true?0:1 }=</span>${A==true? 0:1 }<br>
  <span>${'${'}A!=true?0:1 }=</span>${A==true? 0:1 }<br>
  
  
 
 

</body>
</html>