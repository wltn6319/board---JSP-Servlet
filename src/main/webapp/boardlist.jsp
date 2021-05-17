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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta charset="EUC-KR">
<title>board</title>
</head>
<body>
<div id="display">
		  	   <a href="write"><button type="button" class="btn btn-link">글쓰기</button></a>

	<div class="container">    
	  <table class="table table-hover">
	    <thead>
	      <tr>
	        <th>번호</th>
	        <th>아이디</th>
	        <th>제목</th>
	        <th>날짜</th>
	      </tr>
	    </thead>
	    <tbody>	
	    	<c:forEach items="${boardList}" var="list">
			<tr>
				<td>${list.num}</td>
				<td>${list.userID}</td>
				<td><a href="detail?id=${list.num}">${list.title}</a></td> 
				<td>${list.date}</td>	
			</tr>	
			</c:forEach>
	    </tbody>
	  </table>	  
	</div>
	
</div>
</body>
</html>