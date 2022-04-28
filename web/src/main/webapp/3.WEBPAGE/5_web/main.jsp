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
	<div class="col-md-10 offset-2 content">	<!-- 본문 -->
			
			<div class="carousel slide" data-bs-ride ="carousel" data-bs-interval="1000" id="cs">
	
			<!-- 슬라이드 위치 표시 : 인디케이터 -->
			<div class="carousel-indicators" id="cs">
				<button data-bs-target="#cs" data-bs-slide-to="0" class="active"> </button>
				<button data-bs-target="#cs" data-bs-slide-to="1"> </button>
				<button data-bs-target="#cs" data-bs-slide-to="2"> </button>
			</div>
			
				<div class="carousel-inner" > <!-- 캐러셀 내용물 -->
					<div class="carousel-item active"><img alt="" src="img/c1.jpg" id="cs"> </div>
					<div class="carousel-item "><img alt="" src="img/c2.jpg"> </div>
					<div class="carousel-item "><img alt="" src="img/c3.jpg"> </div>
				</div>
		
		<!-- 이미지 이동 버튼 -->
		
		<button class="carousel-control-prev btns" data-bs-target="#cs" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</button>
		<button class="carousel-control-next btns" data-bs-target="#cs" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
		</button>
	
	 </div> <!-- 캐러셀 end -->
	 	<h3 class="text-center" style="margin-top:30px;">베스트 셀러</h3>
	 	<p class="text-center">#베스트셀러</p>
	 
		
	 	<div class ="row pd">
	 	<%for(int i= 0; i<9; i++){ %>
	 		<div class="col-md-4">
	 			<div class="card"> <!-- 카드형식 -->
	 				<img class="card-img-top" alt="" src="img/item1.webp" > <!-- 이미지 -->
	 				<div class="card-body">
	 					<p class="item">
	 						<span class="title"> [1+1]플레인 와이드 밴딩팬츠</span>
	 						<div class="line"></div>
							<br>
							<h6 class="price1">33,000원</h6> 
							<p style="color: rgba(0,0,0,0.5);"> 3 color / 2 size </p>
	 				</div>
	 			</div>
	 		</div>
	 		<%} %>
	 		
	 		</div>
	 		
	 		<h3 class="text-center">INSTAGRAM</h3>
			<p class="text-center">@딱용</p>
			
	 		
	 	</div>

</body>
</html>