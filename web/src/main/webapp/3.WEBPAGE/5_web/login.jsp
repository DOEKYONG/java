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
		<input type="text" placeholder="아이디" class=" form-control txt">
		<input type="password" placeholder="비밀번호" class=" form-control txt">
		</div>
		<div class="btn_login">
			<button>login</button>
		</div>
	</div>
		<div class="forgot">
	<input type="checkbox"><a href="#">아이디 저장</a>
	<span><a href="#"><i class="fas fa-lock"></i>보안접속 |</a></span>
	 <span class="fid"><a href="#">아이디찾기</a></span><span>|</span> <span class="fid"><a href="#">비밀번호 찾기</a></span>
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
	<p style="margin-top:180px; font-size: 14px;">비회원의 경우, 주문시 주문번호로 주문조회가 가능합니다.</p>
	
	
	
	
	</div>
	<div class="bloginform">
	<div class ="form">
	<span class="sp1">주문자명</span> <span class="form_text"><input type="text"></span>
	</div>
	<div class ="form">
	<span class="sp1">주문번호</span> <span class="form_text"><input type="text" placeholder="하이픈(-)포함"></span>
	</div>
	<div class ="form">
	<span class="sp2">비회원주문 비밀번호</span> <span class="form_text"><input type="password"></span>
	</div>
	
	<button class="blogin"> 비회원 로그인</button>
	
	</div>
	<%@include file ="footer.jsp" %>
	
</div>





</body>
</html>