<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>

	<!-- ��� �������� -->
	<%@include file ="header.jsp" %>
	
	<br><br><br><br><br><br>
	<div class ="container" > <!-- �ڽ��� -->
	
		<h3>��������</h3>
		<div class="col-md5 offset-7 row g-0 my-4">
		
		<div class="col-md-3">
			<select class="form-select">
				<option>Ű����</option>
				<option>��ȣ</option>
				<option>����</option>
				<option>�ۼ���</option>
			</select>
		</div>
		<div class="col-md-6">
			<input type="text" class="form-control">
		</div>	
		<div class="col-md-3">
			<button class="form-control">�˻�</button>
		</div>	
		
		</div>
		
		<table class="table table-hover text-center">
			<tr>
				<th >��ȣ</th>
				 <th >���ǻ���</th> 
				 <th>����</th>
				 <th >�ۼ���</th> 
				 <th >�ۼ���</th> 
			</tr>
			<tr> 
				<td>4</td> <td>����</td> <td><a href="boardview.jsp">ȯ�����ּ���~</a></td> <td>ȫ�浿</td> <td>2022-04-25</td>
			</tr>
			<tr> 
				<td>3</td> <td>ó��</td> <td>Ż����</td> <td>ȫ�浿</td> <td>2022-04-25</td>
			</tr>
			<tr> 
				<td>2</td> <td>����</td> <td>�������!!</td> <td>ȫ�浿</td> <td>2022-04-25</td>
			</tr>
			<tr> 
				<td>1</td> <td>ó��</td> <td>ȯ�����ּ���~</td> <td>ȫ�浿</td> <td>2022-04-25</td>
			</tr>
		</table>
		<div class ="row">
		<div class="col-md-4 offset-4 my-3 ">
			<ul class="pagination"> <!-- ����¡ -->
				<li class="page-item"><a class="page-link" href="#">����</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">4</a></li>
				<li class="page-item"><a class="page-link" href="#">5</a></li>
				<li class="page-item"><a class="page-link" href="#">����</a></li>
			</ul>
		</div>
		<div class="col-md-2 offset-2 my-3">
			<a href="boardwrite.jsp">
			<button class="form-control">�����ϱ�</button>
			</a>
		</div>
		</div>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br>
	
	<!-- Ǫ�� �������� -->
	<%@include file="footer.jsp" %>

</body>
</html>