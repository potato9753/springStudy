<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인 화면-절대경로</h3>
<form action="/app/login" method="get">
아이디:<input type="text" name="userid"><br>
 비번 : <input type="text" name="passwd"><br>
<input type="submit" value="로그인">
</form>
<h3>로그인 화면-상대경로</h3>
<form action="login" method="get">
아이디:<input type="text" name="userid"><br>
 비번 : <input type="text" name="passwd"><br>
<input type="submit" value="로그인">
</form>
</body>
</html>