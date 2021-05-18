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
		<form action="boardupdate?id=${detail.num}" method="post">
            <div class="panel-heading">
                    작성자 :  ${detail.userID}
            </div>
               
            <div>
                <input type="text" name="title" value="${detail.title}">
            </div>
            <p><textarea  cols="50" rows="10" name="content" >${detail.content}</textarea></p>
           
            <button type="subimt">수정하기</button>
        </form>
       
	</div>
</body>
</html>