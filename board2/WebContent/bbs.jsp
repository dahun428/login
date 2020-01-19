<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.javalec.dao.bbsDAO"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>  

<%

String userID = null;
if(session.getAttribute("userID") != null){
	userID = (String) session.getAttribute("userID");}
bbsDAO dao = new bbsDAO();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css" />
<title>JSP 게시판 웹사이트</title>
<style type="text/css">
a, a:hover{
	color: #000000;
	text-decoration:none;
}

</style>
</head>
<body>
	<nav class ="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
			aria-expanded="false">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a href="main.jsp" class="navbar-brand">JSP 게시판 웹사이트</a>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="main.jsp">메인</a></li>
				<li class="active"><a href="list.do">게시판</a></li>
			</ul>
	
		
		<c:choose>
			<c:when test="${sessionScope.userID == null }">	
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">접속하기
					<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="login.jsp">로그인</a></li>
						<li><a href="join.jsp">회원가입</a></li>
					</ul>
				</li>
			</ul>
			</c:when>

			<c:when test="${sessionScope.userID != null }">
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">회원관리
					<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="logoutAction.jsp">로그아웃</a></li>
						<li><a href="update.jsp">회원정보수정</a></li>
						<li><a href="joinOutAction.jsp">회원탈퇴</a></li>
					</ul>
				</li>
			</ul>
			</c:when>
			
		</c:choose>
		</div>
	</nav>
	
	
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align:center; border:1px solid #dddddd; table-layout:fixed;">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align:center;">번호</th>
						<th style="background-color: #eeeeee; text-align:center;">제목</th>
						<th style="background-color: #eeeeee; text-align:center;">내용</th>
						<th style="background-color: #eeeeee; text-align:center;">작성자</th>
						<th style="background-color: #eeeeee; text-align:center;">작성일</th>
						<th style="background-color: #eeeeee; text-align:center;">조회수</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.bbsID }</td>
						<td><a href="view.do?bbsID=${dto.bbsID }">${dto.bbsTitle }</a></td>
						<td style="text-overflow:epllipsis; overflow:hidden;">${dto.bbsContent }</td>
						<td>${dto.userID }</td>
						<td>${dto.bbsDate }</td>
						<td>${dto.bbsHit }</td>
					</tr>
				</c:forEach>	
				</tbody>
			</table>
			<c:choose>
				<c:when test="${requestScope.pageNum != 1}">
					<a href="list.do?pageNum=${requestScope.pageNum - 1 }" class="btn btn-success btn-arraw left">이전</a>
				</c:when>
				
				<c:when test="${requestScope.nextPageNum }">
					<a href="list.do?pageNum=${requestScope.pageNum + 1}" class="btn btn-success btn-arraw left">다음</a>
				</c:when> 
			</c:choose>
			<a href="write.jsp" class="btn btn-primary pull-right">글쓰기</a>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>