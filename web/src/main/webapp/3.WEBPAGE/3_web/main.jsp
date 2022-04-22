<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	#main{
		
		
	}
	#first{
		display: flex;
		justify-content: center;
		align-items: center;
		margin-top: 20px;
		margin-bottom: 80px;
	}
	.left{
		display: flex;
		
	}
	.ftext{
		display: flex;
		flex-direction: column;
		margin-left: 40px;
	}
	.ftext h4{
		margin-bottom:  5px;
	}
	.right{
		margin-left: 40px;
	}
	#second {
		display: flex;
		justify-content: center;
		margin-top: 40px;
		margin-bottom: 80px;
	}
	.items img{
		width: 280px;
		height: 200px;
	}
	
</style>
</head>
<body>
	<div id ="main">
	<div id="first">
		<div class ="left">
		<span><img alt="" src="img/icon1.png"></span>
		<div class = "ftext">
		<h4>예약안내</h4>
		스튜디오 대여는 사전에 인터넷 예약을 하셔야 합니다. <br>
		예약은 1일 이전까지 가능합니다.
		</div>
		</div>
		
		<div class ="left right">
		<span><img alt="" src="img/icon2.png"></span>
		<div class = "ftext">
		<h4>포토갤러리</h4>
		취업 사진,가족 사진,프로필 사진,우정 사진 등 개인 또 <br>
		는 단체가 이용할 수 있습니다 .
		</div>
		</div>
	</div>
		
		<div id="second">
		
		<div class="items">
		<img src="img/image1.jpg">
		<div class= "itext">
		<h4>촬영 스튜디오</h4>
		카메라, 조명 등 촬영 장비 완비
		</div>
		</div>
		<div class="items">
		<img src="img/image2.jpg">
		<div class= "itext">
		<h4>촬영 스튜디오</h4>
		카메라, 조명 등 촬영 장비 완비
		</div>
		</div>
		<div class="items">
		<img src="img/image3.jpg">
		<div class= "itext">
		<h4>촬영 스튜디오</h4>
		카메라, 조명 등 촬영 장비 완비
		</div>
		</div>
		<div class="items">
		<img src="img/image4.jpg">
		<div class= "itext">
		<h4>촬영 스튜디오</h4>
		카메라, 조명 등 촬영 장비 완비
		</div>
		</div>
		</div>
	</div>

</body>
</html>