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
		<h4>����ȳ�</h4>
		��Ʃ��� �뿩�� ������ ���ͳ� ������ �ϼž� �մϴ�. <br>
		������ 1�� �������� �����մϴ�.
		</div>
		</div>
		
		<div class ="left right">
		<span><img alt="" src="img/icon2.png"></span>
		<div class = "ftext">
		<h4>���䰶����</h4>
		��� ����,���� ����,������ ����,���� ���� �� ���� �� <br>
		�� ��ü�� �̿��� �� �ֽ��ϴ� .
		</div>
		</div>
	</div>
		
		<div id="second">
		
		<div class="items">
		<img src="img/image1.jpg">
		<div class= "itext">
		<h4>�Կ� ��Ʃ���</h4>
		ī�޶�, ���� �� �Կ� ��� �Ϻ�
		</div>
		</div>
		<div class="items">
		<img src="img/image2.jpg">
		<div class= "itext">
		<h4>�Կ� ��Ʃ���</h4>
		ī�޶�, ���� �� �Կ� ��� �Ϻ�
		</div>
		</div>
		<div class="items">
		<img src="img/image3.jpg">
		<div class= "itext">
		<h4>�Կ� ��Ʃ���</h4>
		ī�޶�, ���� �� �Կ� ��� �Ϻ�
		</div>
		</div>
		<div class="items">
		<img src="img/image4.jpg">
		<div class= "itext">
		<h4>�Կ� ��Ʃ���</h4>
		ī�޶�, ���� �� �Կ� ��� �Ϻ�
		</div>
		</div>
		</div>
	</div>

</body>
</html>