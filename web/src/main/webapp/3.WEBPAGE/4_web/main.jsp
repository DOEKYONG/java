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
	
	<div class="carousel slide" data-bs-ride ="carousel" data-bs-interval="1000" id="cs">
	
	<!-- �����̵� ��ġ ǥ�� : �ε������� -->
	<div class="carousel-indicators" id="cs">
		<button data-bs-target="#cs" data-bs-slide-to="0" class="active"> </button>
		<button data-bs-target="#cs" data-bs-slide-to="1"> </button>
		<button data-bs-target="#cs" data-bs-slide-to="2"> </button>
		<button data-bs-target="#cs" data-bs-slide-to="3"> </button>
	</div>
	
		<div class="carousel-inner" > <!-- ĳ���� ���빰 -->
			<div class="carousel-item active"><img alt="" src="img/c1.jpg" id="cs"> </div>
			<div class="carousel-item "><img alt="" src="img/c2.jpg"> </div>
			<div class="carousel-item "><img alt="" src="img/c3.jpg"> </div>
			<div class="carousel-item "><img alt="" src="img/c4.jpg.crdownload"> </div>
		</div>
		
		<!-- �̹��� �̵� ��ư -->
		<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</button>
		<button class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
		</button>
	 </div> <!-- ĳ���� end -->
	 <br><br>
	 
	 <div class="container text-center">
	 	<hr> 
	 		<h3 class="new">New ARRIVAL</h3>
	 		<P class = "new2">�Ż�ǰ</P>
	 </div>
	 
	 <div class="container">
	 	<div class="row">
	 	<%for(int i= 0; i<8; i++){ %>
	 		<div class="col-md-3">
	 			<div class="card"> <!-- ī������ -->
	 				<img class="card-img-top" alt="" src="img/item1.webp" > <!-- �̹��� -->
	 				<div class="card-body">
	 					<p class="item">
	 						<span class="title"> ���Ĵٵ� ���� ������ 7�� ����Ƽ</span>
	 						<br>
	 						<span class="content">
	 							[1+1] ������� ������ ������
								(S/M/L/XL/2XL/3XL)
								700�� �ı� ����! ���� �Ǹ� 1��!
	 						</span>
							<br>
							<span class="price1">79,900��</span> 
							<spna class="price2">75,900��</spna>
							<br>
							<span class="badge bg-warning text-dark my-3" >�ֹ�����</span>
							<span class="badge bg-danger text-dark my-3">ǰ���ӹ�</span>
	 					</p>
	 				
	 				</div>
	 			</div>
	 		</div>
	 		<%} %>
	 	</div>
	 </div>
	 
	
	
	
	
	
	
	
	
	
	
	<%@include file="footer.jsp" %>

</body>
</html>