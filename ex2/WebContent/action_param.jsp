<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page = "forward_param.jsp">
	<jsp:param name = "id" value="adsdf"/>
	<jsp:param name = "pw" value="1234"/>
</jsp:forward>
<!--
    [   액션 태그   ]
    1. forward 액션 태그
        : 현재 페이지에서 다른 페이지로 이동시킬 때 사용한다. 단! response.sendRedirect()와는 달리
            !! 페이지를 이동해도 URL이 바끼지 않고 페이지 이동 전 URL상태로 남아있게 되는게 특징이다.
            ex) A페이지에서 B페이지로 이동해도 주소창에는 A페이지 주소임
    2. include 액션 태그
        : include 지시자와 달리 동적으로 페이지에 소스코드를 붙여넣는 효과
        : forward와 include 액션 태그는 param 액션 태그를 통해 데이터를 전달할 수 있다.
    3. param 액션 태그
 -->
  
    <!--1. forward 액션 태그 -->
 
        <!-- param을 통해 forward01.jsp로 age,name을 전달하고 있고, 해당 forward01.jsp에서는
            request.getParameter("age")등을 통해 데이터를 꺼내올 수 있다.
         -->
    
     
    <!--2. include 액션 태그 -->
 


</body>
</html>