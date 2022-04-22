<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	#header{
		height: 50px;
		width: 1100px; margin: 0 auto;
		display: flex;
		justify-content: space-around;
		
	}
	#header-left span{
		font-size: 30px;
		font-weight: bold;
	}
	#header-left{
	    margin-top: 10px;
	}
	#logo{
		color: blue;
		margin-right: 20px;
		margin-top: 20px;
		}
	#header-right{
		margin : 10px;
	}
	#header-right span{
		margin :0 12px 0 12px;
	}
	a{text-decoration: none; color: black;}

</style>

</head>
<body>
	<div id="header">
	<div id ="header-left">
	<span id ="logo">THE</span> <span>스튜디오</span>
	</div>
	
	<div id="header-right">
	<span><a href="">스튜디오 소개</a></span> <span><a href="#">스튜디오 예약</a></span> <span><a href="#">블로그</a></span> <span><a href="#">포토 갤러리</a></span>
	<span><a href="#">오시는길</a></span>
	</div>	
	
	</div>


</body>
</html>