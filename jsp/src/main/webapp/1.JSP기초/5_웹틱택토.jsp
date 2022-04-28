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
	
	var count = 0;
	function btnDisabled( i )  {
		 // 여기에 jsp i 넣는법 파라미터 이용
			
			count = count+1;
		  const target = document.getElementsByClassName('btn')[i];
		  const t1 = 	document.getElementsByClassName('btn')[target.name].value;
		  
				target.value = "x";
				target.disabled="true";
				console.log(t1);
				
				// 괜히 자바스크립트씀....
			
				
		
				if(count<8) {
					return	btnRandom();
				}
				else {target.value = "x";}
			
		
		}
	
	function btnRandom() {
		for(var j = 0; j<9; j++){
			const com =	Math.floor(Math.random() * 9);
			if(document.getElementsByClassName('btn')[com].disabled===false ) {
				document.getElementsByClassName('btn')[com].value ="o";
				document.getElementsByClassName('btn')[com].disabled = "true";
				return btnDisabled()
			}
			else {
				j--;
			}
		}
	}
		
	

	
	
	</script> 
	
	<!-- 자바언어 작성공간 -->
	<%
	

	%>
	
	<!-- html 작성공간 -->
	<% int j= 0; %>
	<% for(int i = 0; j<9; i++) { %>
	
		<input  type="button" onclick="btnDisabled(<%=i %>)" value="<%=i%>" name="<%=i%>" class = "btn"  >
		
		<% if (j%3==2){%>
		<br>
	<% }%>
	<% j++;%>
	<%}%>
	
	
	
	
	
	
	
	

</body>
</html>