<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>


</head>
<body>
	<%@include file="1_��ġ.jsp" %>
	
	<!-- �̹��� �����̴� -->
	<div class="container"> <!-- �ڽ��� -->
	
		<!-- ĳ���� -->
		<div id="cs" class="carousel slide " data-bs-ride="carousel" data-bs-interval="1000"> <!-- ĳ���� -->
				
				<!-- ĳ���� [������ġ] �ϴ� ��ư : �ε������� -->
				<div class="carousel-indicators">
					<button type="button" data-bs-target="#cs" data-bs-slide-to = "0" class="active"></button>
					<button type="button" data-bs-target="#cs" data-bs-slide-to = "1"></button>
					<button type="button" data-bs-target="#cs" data-bs-slide-to = "2"></button>
				</div>
				
				
				<div class="carousel-inner">
				<!-- ĳ���� ���� -->
				<div class="carousel-item active"> 
					<img src="../img/�����3.jpg" width="100%" height="30%">
					<div class="carousel-caption">
						adsfds
					</div>
				</div>
			
				<div class="carousel-item"> <!-- ĳ���� ���� -->
					<img src="../img/�����3.jpg" width="100%" height="30%">
				</div>
			
				<div class="carousel-item"> <!-- ĳ���� ���� -->
					<img src="../img/�����3.jpg" width="100%" height="30%">
				</div>
				
				</div>
				
				
			
				<!-- ĳ���� �̵� ��ư -->
				<button type="button" class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</button>		
				
				<!-- ĳ���� �̵� ��ư -->
				<button type="button" class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
					<span class="carousel-control-next-icon"></span>
				</button>			
				
		</div>
	</div>

</body>
</html>