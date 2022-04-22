<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<!-- 부트스트랩 css 포함 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	
	<!--  사용자정의한 css포함 -->
	<link rel="stylesheet" type="text/css" href="CSS/main.css">
</head>
<body>
	
	<div class="fixed-top bg-white">
		<div class="container "> <!-- 박스권 형성 -->
		<div class="py-3"> <!-- 상단 메뉴 -->
				<!-- p : 안쪽 여백   py-* : 위아래 안쪽 여백  
					m : 바깥 여백    my-* : 위아래 바깥 여백
				-->
			<div class="row"> <!-- 가로배치 -->
				<div class="col-md-4 offset-4 text-center"> <!-- 그리드 12조각중 4조각 사용 -->
									<!-- 박스권내 내용물 가운데 정렬 -->
									<!-- offset-4 :여백그리드  -->
					<a href="main.jsp" class="header_logo"> 안산 남자 쇼핑몰 </a>
				</div>
				<div class="col-md-4 d-flex justify-content-end" > <!-- 상단메뉴 -->
					<ul class="nav"> <!-- nav : 가로배치 -->
						<li><a href="#">로그인 |  </a></li>
						<li><a href="#"> 회원가입 | </a></li>
						<li><a href="#"> 장바구니</a></li>
					</ul>
				</div>
				
			</div>
		</div>
		<div class="navbar navbar-expand-md navbar-light bg-white"> <!-- 본 메뉴 -->
		
			<!-- 숨겨진 메뉴 펼치기 버튼 -->
			<button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navcl">
				<span class="navbar-toggler-icon"></span>
			</button>
		
			<div class="collapse navbar-collapse" id="navcl">
				<ul class="navbar-nav col-md-12 justify-content-between">
					<li class="nav-item"><a href="#" class="nav-link">베스트 상품</a></li>
					<li class="nav-item"><a href="#" class="nav-link">수트</a></li>
					<li class="nav-item"><a href="#" class="nav-link">아우터</a></li>
					<li class="nav-item"><a href="#" class="nav-link">상의</a></li>
					<li class="nav-item"><a href="#" class="nav-link">니트</a></li>
					<li class="nav-item"><a href="#" class="nav-link">셔츠</a></li>
					<li class="nav-item"><a href="#" class="nav-link">바지</a></li>
					<li class="nav-item"><a href="#" class="nav-link">신발</a></li>
					<li class="nav-item"><a href="#" class="nav-link">악세사리</a></li>
					<li class="nav-item"><a href="#" class="nav-link">스타일</a></li>
					<li class="nav-item"><a href="#" class="nav-link">리뷰</a></li>
					<li class="nav-item"><a href="#" class="nav-link">고객센터</a></li>
					<li class="nav-item"><a href="#" class="nav-link"><i class="fas fa-search"></i></a></li>
				</ul>
			</div>
		</div>
	</div>
		
		
	</div>
	

	<!-- 부트스트랩 js 포함 -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	
	
</body>
</html>