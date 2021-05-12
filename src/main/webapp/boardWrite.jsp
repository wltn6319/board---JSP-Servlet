<%@page import="java.awt.List"%>
<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<link href="css/board.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="EUC-KR">
<title>board</title>
</head>
<body>
	<div id="display">
		<form action="write" method="post">
			<input type="text" placeholder="작성자" name="usrID" required="required"><br>
			<input type="text" placeholder="제목" name="title" required="required"><br>
			<input type="text" placeholder="내용" name="content" required="required"><br>
			<input type="submit" value="확인">
		</form>
	</div>
</body>
</html>