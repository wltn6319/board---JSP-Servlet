<%@page import="java.awt.List"%>
<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<link href="css/main.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="EUC-KR">
<title>board</title>
</head>
<body>
	<div id="display">
		<div id="header">
			<h1>This is my borad page~</h1>
		</div>
		<div id="section">
			<div class="board"><a href="#">로그인</a></div>	
			<div class="login"><a href="#">게시판</a></div>
		</div>
		<div id="footer">
			<span>JSP $ Servlet을 활용하여 게시판을 만들어 보았습니다.</span>
		</div>
		
	</div>
</body>
</html>