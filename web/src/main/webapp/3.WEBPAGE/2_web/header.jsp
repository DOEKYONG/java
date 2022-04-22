<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	li{ list-style-type: none;}
	a{text-decoration: none; color: black;}
	a:hover{
		color: gold;
	}
	#header{height: 200px;}
	#box {width: 1100px; margin: 0 auto;}
	#logo{float : left;}
	#menus{float: right;}
	#menus li{display: inline;}
	
	@font-face {
    font-family: 'CBNUJIKJI';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2202@1.0/CBNUJIKJI.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
	#main_menu li{
		font-family: 'CBNUJIKJI';
		font-size: 20px; margin: 50px 0 0 80px;
	}
	#top_menu{
		margin: 30px 0;  
	}
	#top_menu li{
		margin-left: 10px;
	}
	#menus{
	text-align: right; float: right;
	}
	#logo{
		margin: 50px 0 0 50px;
		float: left;
	}

</style>
</head>
<body>
	
	<div id="header">  <!-- ��� ��ü -->
		<div id ="box"> <!-- ����� �ڽ��� -->
			<div id="logo"> <!-- �ΰ� -->
			<a href="index.jsp"><img alt="" src="img/logo.png"></a>
			</div>
			
			<div id="menus"> <!-- �޴� -->
			<ul id="top_menu"> <!-- ��ܸ޴� -->
				<li>������(jykim)�� |</li>
				<li><a href="#">�α׾ƿ�  </a> | </li>
				<li><a href="#">��������</a></li>
			</ul>
			
			<ul id = "main_menu"> <!-- �ϴܸ޴� -->
				<li><a href="index.jsp">Home</a></li>
				<li><a href="#">�⼮��</a></li>
				<li><a href="#">��ǰ������</a></li>
				<li><a href="#">�Խ���</a></li>
			</ul>
			
			</div>
		</div>
	</div>

</body>
</html>