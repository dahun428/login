<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>�Ƹ�����Ʈ �ñ� ����</h1>
    
    
    <form action="AlbaApp" method="post">
    <ul>
        <li><span>�˹�ó : </span>
            <select name="Alba" id="job">
                <option value="">�Ƹ�����Ʈ ����</option>
                <option value="AJis">�������(AJis)</option>
                <option value="Hyatt">ȣ��(Hyatt)</option>
                <option value="other">��Ÿ</option>
            </select>
        </li>
        <li><span>�ñ� : </span><input type="text" name="Time_Money"></li>
        <li><span>����/����Ÿ��(07:00~22:00)</span>
            <select name="Time_noon" id="Time_noon">
                <option value="0">---</option>
                <option value="3">3�ð�</option>
                <option value="3.5">3�ð� 30��</option>
                <option value="4.5">4�ð�</option>
                <option value="4.5">4�ð� 30��</option>
                <option value="5">5�ð�</option>
                <option value="5.5">5�ð� 30��</option>
                <option value="6">6�ð�</option>
                <option value="6.5">6�ð� 30��</option>
                <option value="7">7�ð�</option>
            </select>
        </li>
        <li><span>�߰�Ÿ��(22:00~07:00)</span>
            <select name="Time_night" id="Time_night">
                <option value="0">---</option>
                <option value="3">3�ð�</option>
                <option value="3.5">3�ð� 30��</option>
                <option value="4">4�ð�</option>
                <option value="4.5">4�ð� 30��</option>
                <option value="5">5�ð�</option>
                <option value="5.5">5�ð� 30��</option>
                <option value="6">6�ð�</option>
                <option value="6.5">6�ð� 30��</option>
                <option value="7">7�ð�</option>
            </select>
        </li>
        <li>����� : <input type="submit" id="btn1" value="�������"><input type="reset" value="����" />
        <div id="final" style="border:1px solid gray;"></div></li>

    </ul>
	</form>





</body>
</html>