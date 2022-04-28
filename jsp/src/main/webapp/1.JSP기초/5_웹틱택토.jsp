<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 스크립트 -->
	<script>
	
	let 난수 = Math.floor(Math.random() * 9);
	function btnDisabled( i )  {
		 // 여기에 jsp i 넣는법
		 
		  const target = document.getElementsByClassName('btn')[i];
		 if(target.value(i) == "x" || target.value(i) == "o"){
			 alert("이미선택된버튼")
			  return btnDisabled( i );
		 }
		 else
				target.value = "x";
		}
	
	function com(난수) {
		const random = document.getElementsByClassName('btn')[i];
		random.value ="o"
	}
	
	
	</script> 
	
	<!-- 자바언어 작성공간 -->
	<%

	%>
	
	<!-- html 작성공간 -->
	<% int j= 0; %>
	<% for(int i = 0; j<9; i++) { %>
	
		<input  type="button" onclick="btnDisabled(<%=i %>); com(난수); " value="<%=i%>" name="<%=i%>" class = "btn"  >
		
		<% if (j%3==2){%>
		<br>
	<% }%>
	<% j++;%>
	<%}%>
	
	
	

</body>
</html>