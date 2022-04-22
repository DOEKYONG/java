<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>


</head>
<body>
	<%@include file="1_설치.jsp" %>
	
	<!-- 이미지 슬라이더 -->
	<div class="container"> <!-- 박스권 -->
	
		<!-- 캐러셀 -->
		<div id="cs" class="carousel slide " data-bs-ride="carousel" data-bs-interval="1000"> <!-- 캐러셀 -->
				
				<!-- 캐러셀 [내용위치] 하단 버튼 : 인디케이터 -->
				<div class="carousel-indicators">
					<button type="button" data-bs-target="#cs" data-bs-slide-to = "0" class="active"></button>
					<button type="button" data-bs-target="#cs" data-bs-slide-to = "1"></button>
					<button type="button" data-bs-target="#cs" data-bs-slide-to = "2"></button>
				</div>
				
				
				<div class="carousel-inner">
				<!-- 캐러셀 내용 -->
				<div class="carousel-item active"> 
					<img src="../img/고양이3.jpg" width="100%" height="30%">
					<div class="carousel-caption">
						adsfds
					</div>
				</div>
			
				<div class="carousel-item"> <!-- 캐러셀 내용 -->
					<img src="../img/고양이3.jpg" width="100%" height="30%">
				</div>
			
				<div class="carousel-item"> <!-- 캐러셀 내용 -->
					<img src="../img/고양이3.jpg" width="100%" height="30%">
				</div>
				
				</div>
				
				
			
				<!-- 캐러셀 이동 버튼 -->
				<button type="button" class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</button>		
				
				<!-- 캐러셀 이동 버튼 -->
				<button type="button" class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
					<span class="carousel-control-next-icon"></span>
				</button>			
				
		</div>
	</div>

</body>
</html>