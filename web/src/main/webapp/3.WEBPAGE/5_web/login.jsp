<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@include file ="header.jsp" %>
<%@include file ="sidebar.jsp" %>
<div class="col-md-10 offset-2 content">
<h3 class="text-center" style=" margin-top:40px;">LOGIN</h3>
	<div class="login">
	<div class="loginwrap">
		<div class="loginform">
		<input type="text" placeholder="���̵�" class=" form-control txt">
		<input type="password" placeholder="��й�ȣ" class=" form-control txt">
		</div>
		<div class="btn_login">
			<button>login</button>
		</div>
	</div>
		<div class="forgot">
	<input type="checkbox"><a href="#">���̵� ����</a>
	<span><a href="#"><i class="fas fa-lock"></i>�������� |</a></span>
	 <span class="fid"><a href="#">���̵�ã��</a></span><span>|</span> <span class="fid"><a href="#">��й�ȣ ã��</a></span>
	</div>
	<div class="imgbtn1">
		<a href="#"><img alt="" src="img/naver.gif"></a>
		<a href="#"><img alt="" src="img/facebook.gif"></a>
	</div>
		<div class="imgbtn2">
		<a href="#"><img alt="" src="img/kakao.gif"></a>
		<a href="#"><img alt="" src="img/apple.gif"></a>
	</div>
	<div class="btn_join">
	<button>JOIN</button>
	</div>
	<p style="margin-top:180px; font-size: 14px;">��ȸ���� ���, �ֹ��� �ֹ���ȣ�� �ֹ���ȸ�� �����մϴ�.</p>
	
	
	
	
	</div>
	<div class="bloginform">
	<div class ="form">
	<span class="sp1">�ֹ��ڸ�</span> <span class="form_text"><input type="text"></span>
	</div>
	<div class ="form">
	<span class="sp1">�ֹ���ȣ</span> <span class="form_text"><input type="text" placeholder="������(-)����"></span>
	</div>
	<div class ="form">
	<span class="sp2">��ȸ���ֹ� ��й�ȣ</span> <span class="form_text"><input type="password"></span>
	</div>
	
	<button class="blogin"> ��ȸ�� �α���</button>
	
	</div>
	<%@include file ="footer.jsp" %>
	
</div>





</body>
</html>