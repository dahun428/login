<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<p> ���������� ���� ������ � ������ ��û�ϴ� ���� request ��� �մϴ�.
�׸��� �̷� ��û ������request ��ü�� �����մϴ�.
</p>
<pre>
getContextPath() : �����ø����̼��� ���ؽ�Ʈ �н��� ����ϴ�.
getMethod() : get��İ� post ����� ������ �� �ֽ��ϴ�.
getSession() : ���� ��ü�� ����ϴ�.
getProtocol() : �ش� ���������� ����ϴ�.
getRequestURL() : ��û URL�� ����ϴ�.
getRequestURI() :  ��û URI�� ����ϴ�.
getQuerySting() : ������Ʈ���� ����ϴ�.

<%

out.println("���� : " + request.getServerName() + "<br />");
out.println("��Ʈ ��ȣ : " + request.getServerPort() + "<br />");
out.println("��û���  : " + request.getMethod() + "<br />");
out.println("�������� : " + request.getProtocol()+ "<br />");
out.println("URL : " + request.getRequestURL() + "<br />");
out.println("URI : " + request.getRequestURI() + "<br />");

%>

Jsp�������� �����ϴ� ������ �����͸� ���� �����ϱ� ���ؼ��̹Ƿ�, parameter ���� �޼ҵ�� �߿��մϴ�.

getParameter(String name) : name�� �ش��ϴ� �Ķ���� ���� ����
getParameterNames(); : ��� �Ķ���� �̸��� ����
getParameterValues(String name) : name�� �ش��ϴ� �Ķ���� ���� ����.

</pre>
<pre>
getCharacterEncording() : �����Ҷ� ������ ���ڵ� ���¸� ���մϴ�.
addCookie(Cookie) : ��Ű�� �����մϴ�.
sendRedirect(URL) : ������ url�� �̵��մϴ�.




</pre>

</body>
</html>