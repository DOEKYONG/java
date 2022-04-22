<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	input{
		width: 600px;
		height: 45px;
	}
	button{
		width: 100px;
		height: 50px;
		background-color: #555555;
		color: white;
		margin-left: 5px;
	}
	h1{
	text-align: center;
	margin-bottom: 30px;
	}
	.board{
	margin : 0 auto;
	margin-bottom: 300px;
	width: 1200px;
		
	}
	.header{
		
		margin : 0 auto;
		display: flex;
		justify-content : center;
		align-items: center;
		height: 100px;
		background-color: #f9f7f9;
	}
	.mainheader{
	
		height:40px;
		border-bottom: 1px solid rgba(0,0,0,0.2);
		border-top: 1px solid rgba(0,0,0,0.2);
		display: flex;
		align-items :center;
		justify-content: space-between;
		padding : 10px 120px 10px 120px;

		
			}
	.form{
	
		padding-top : 10px;
		
		height:40px;
		border-bottom:1px solid rgba(0,0,0,0.2);
		border-top: 1px solid rgba(0,0,0,0.2);
		
	
	}
	.num{
		
		margin-left: 130px;
		
		
	}
	.title{
		margin-left: 150px;
	}
	.date{
		float: right;
		margin-right: 106px;
		
	}
	

</style>
</head>
<body>
	
	<%@include file="header.jsp"%>
	<%@include file="mainimage.jsp"%>
	
	<!-- 본문 -->
	<h1>공지사항</h1>
	<div class ="board">
		<div class="header">
			<span><input type ="text" placeholder="검색어를 입력해주세요"></span> <span><button>검색</button></span>
		</div>
		<div class="main">
		<div class="mainheader">
		<span>번호</span> <span>제목</span> <span>등록일</span> 
		</div>
		<div class="form"><span class="num">3</span> <span class="title">[공지사항]개인정보 처리방침 변경안내처리방침</span>
		<span class ="date">2017.07.13</span>
		</div>
		<div class="form"><span class="num">2</span> <span class="title">공지사항 안내입니다. 이용해주셔서 감사합니다.</span>
		<span class ="date">2017.06.15</span>
		</div>
		<div class="form"><span class="num">1</span> <span class="title">공지사항 안내입니다. 이용해주셔서 감사합니다.</span>
		<span class ="date">2017.06.15</span>
		</div>
		
		
		</div>
	
	
	
	
	</div>
	
	
	
	
	<%@include file="footer.jsp"%>

</body>
</html>