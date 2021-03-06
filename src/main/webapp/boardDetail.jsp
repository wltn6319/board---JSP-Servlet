<%@page import="java.awt.List"%>
<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<link href="css/boardDetail.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>board</title>
</head>
<body>
<div id="display">
	<div class="button">
	<a href="list"><input type="submit" value="이전"/></a>
	<a href="boardDelete?id=${detail.num}"><input type="submit" value="삭제" onclick="if(!confirm('삭제하시면 복구할수 없습니다. \n 정말로 삭제하시겠습니까??')){return false;}" /></a>
	<a href="boardupdate?id=${detail.num}"><input type="submit" value="수정"/></a>
	
	</div>
	<div id="details">

		<div class="detail">
			<span class="userId">작성자</span><span class="info_usreId cnt">${detail.userID}</span>
			<span class="date">날짜</span><span class="info_date cnt">${detail.date}</span>
		</div>
		<div class="detail">
			<span class="title">제목</span><span class="info_title cnt">${detail.title}</span>
		</div>
		<div class="detail">
			<span class="content">내용</span><span class="info_content cnt">${detail.content}</span>
		</div>

   </div>
	
   </div>


</body>
</html>