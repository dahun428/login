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
    [   �׼� �±�   ]
    1. forward �׼� �±�
        : ���� ���������� �ٸ� �������� �̵���ų �� ����Ѵ�. ��! response.sendRedirect()�ʹ� �޸�
            !! �������� �̵��ص� URL�� �ٳ��� �ʰ� ������ �̵� �� URL���·� �����ְ� �Ǵ°� Ư¡�̴�.
            ex) A���������� B�������� �̵��ص� �ּ�â���� A������ �ּ���
    2. include �׼� �±�
        : include �����ڿ� �޸� �������� �������� �ҽ��ڵ带 �ٿ��ִ� ȿ��
        : forward�� include �׼� �±״� param �׼� �±׸� ���� �����͸� ������ �� �ִ�.
    3. param �׼� �±�
 -->
  
    <!--1. forward �׼� �±� -->
 
        <!-- param�� ���� forward01.jsp�� age,name�� �����ϰ� �ְ�, �ش� forward01.jsp������
            request.getParameter("age")���� ���� �����͸� ������ �� �ִ�.
         -->
    
     
    <!--2. include �׼� �±� -->
 


</body>
</html>