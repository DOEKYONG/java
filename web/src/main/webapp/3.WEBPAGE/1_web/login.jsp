<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
body{
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
}
.main {
	display: flex;
	margin-top : 100px;
	margin-bottom: 300px;
	
}
.ifno{
	display: flex;
	flex-direction: row;
}
.form{
	margin-top: 10px;
}

.texti {
	  width : 200px;
	  height:30px;
	  font-size:20px;
}
.id{
	margin-left: 20px;
	}
.pw {
	margin-left: 5px;
}

.btn {
	margin-top: 8px;
	
	margin-left: 3px;
}
button{

	width: 100px;
	height: 82px;
	}
	h1{margin-top: 50px;}

</style>
</head>
<body>

	<%@include file="header.jsp"%>
	<%@include file="mainimage.jsp"%>
	
	<!-- ���� -->
	<h1>�α���</h1>
	<div class="main">
	<div class="info">
		<div class="form">
		<span class="lbl">���̵�</span> <span class="text"><input type="text" class="texti id" > </span>
		</div>
		<div class="form">
		<span class="lbl">��й�ȣ</span> <span class="text"><input type="text" class="texti pw"> </span>
		</div>
	</div>
	<div class ="btn" >
		<button>�α���</button>
	</div>
</div>
	
	<%@include file="footer.jsp"%>

</body>
</html>