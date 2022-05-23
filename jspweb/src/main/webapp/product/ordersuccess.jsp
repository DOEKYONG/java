<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@include file = "../header.jsp" %>
		<div class="container">

<div class="processbox">
				<span> 01 옵션선택 </span> <span> > </span>
				<span> 02 장바구니 </span> <span> > </span>
				<span  id="process_active"> 03 주문결제 </span> <span> > </span>
				<span style="font-size: 1.0vw"> 04 주문완료 </span>
				<a href="/jspweb/member/myshopping.jsp"><button >내 주문내역</button></a>
			</div>	
			</div>


<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	<script type="text/javascript" src="/jspweb/js/orderpay.js"></script>
	<%@include file = "../footer.jsp" %>
	
</body>
</html>