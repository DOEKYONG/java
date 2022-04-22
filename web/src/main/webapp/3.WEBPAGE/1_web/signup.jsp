<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	
	.header{
		display: flex;
		justify-content: center;
	}
	.main{
	display : flex;
	justify-content : center;
	align-items : center;
	flex-direction: column;
	
	}
	.content{
	display : flex;
	font-size: 20px;
	flex-direction:column;
	border-top-width :1px; border-top-style:dashed; border-top-color:gray;
	border-bottom-width:1px; border-bottom-style:dashed; border-bottom-color:gray;
	width : 600px;
	height: 550px;
	
	}
	.form{
		margin-top: 20px;
	}
	
	.lbl{
	margin-right: 60px;
	}
	
	.texti {
	  width : 200px;
	  height:30px;
	  font-size:20px;
}
	.id{
	margin-left: 20px;
	}
	.name{
	margin-left: 40px;
	
	}
	.email1{
		width : 120px;
		margin-left: 20px;
	}
	#sb{
		width : 200px;
	  height:30px;
	  font-size:20px;
	}
	.radio{
		padding: 23px;
	}
	.cb{
		padding: 26px;
		}
	textarea{
		
	}
	.formlast{
	display: flex;
	flex-direction: row;
	margin-top: 20px;
	
	}
	.tb{
	margin-left: 80px;
	}
	.footer{
	    margin-left: 400px;
    margin-top: 20px;
	}
	button {
	
	width: 80px;
	height: 40px;
	}
	.footer{
		margin-bottom: 30px;
	}
	h1{
		margin-bottom: 50px;
	}
	
	
</style>

</head>
<body>

	<%@include file="header.jsp"%>
	<%@include file="mainimage.jsp"%>
	<!-- 본문 -->
	
	<div class="main"> 
		<div class="header">
		<h1>회원 가입 폼</h1>
		</div>
		<div class="content">
		<div class="form">
		<span class="lbl">아이디</span> <span class="text"><input type="text" class="texti id" > </span>
		</div>
		<div class="form">
		<span class="lbl">비밀번호</span> <span class="text"><input type="text" class="texti"> </span>
		</div>
		<div class="form">
		<span class="lbl">비밀번호</span> <span class="text"><input type="text" class="texti"> </span>
		</div>
		<div class="form">
		<span class="lbl">이름</span> <span class="text"><input type="text" class="texti name"> </span>
		</div>
		<div class="form">
		<span class="lbl">이메일</span> <span class="text"><input type="text" class="texti email1" > </span> 
		<span class="text">@ 
		<select id="sb" name="job">
		<option value="">직접입력</option>
	    <option value="">naver.com</option>
	    <option value="학생">daum.net</option>
	    <option value="회사원">gmail.com</option>
		</select> </span>
		<div class = "form">
		<span>이메일 수신</span> <span class="radio"> <input type="radio" name="r1">비수신  <input type="radio" name="r1">수신</span>
		</div>	
		
		<div class = "form">
		<span>가입경로</span> <span class="cb"></span><input type="checkbox"> 친구추천 <input type="checkbox"> 인터넷 검색 <input type="checkbox"> 기타 
		</div>
		
		<div class = "formlast">
		<div>인사말</div> <div class="tb"><textarea rows="6" cols="50" ></textarea></div>
		</div>	
	
		</div>
	</div>
	<div class="footer">
	<button >저장</button>
	<button >취소</button>
	</div>
	
	
	</div>
	
	
	<%@include file="footer.jsp"%>

</body>
</html>