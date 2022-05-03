<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<%@include file = "../header.jsp" %>
	
	<div class=login_wrap>
	<h3 style="margin-bottom: 30px;"> 로그인페이지 </h3>
		<form action="../login" method="post">
		<div class="login_login_idform">
			로그인  <input type="text" name="mid">
		</div>
			<div class="login_login_pwform">
			비밀번호  <input type="text" name="mpassword">
			</div>
			<div class="login_btnarea"><input type="submit" value="로그인" id ="btnlogin"></div>
			
			<!-- 만약에 로그인실패시 -->
			<%
				String result = request.getParameter("result");
				if( result != null && result.equals("2") ){
			%>
				<span id ="alert"> 동일한 회원정보가 없습니다.</span>		
			<%	
				}
			%>
		</form>
	</div>
	<%@include file = "../footer.jsp" %>

</body>
</html>