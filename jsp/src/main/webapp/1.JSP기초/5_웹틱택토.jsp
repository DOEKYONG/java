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
		 // const t1 = 	document.getElementsByClassName('btn')[target.name].value;
		 		pwin();
				pwin2();
				winline();
		  
				target.value = "x";
				target.disabled="true";
			//	console.log(t1);
				
				// 괜히 자바스크립트씀....
				
			
				
		
				if(count<8) {
					return	btnRandom();
					
				}
				
				else {target.value = "x";
				pwin();
				pwin2();
				winline();}
			
		
		}
	
	function btnRandom() {
		for(var j = 0; j<9; j++){
			const com =	Math.floor(Math.random() * 9);
			if(document.getElementsByClassName('btn')[com].disabled===false ) {
				cwin();
				cwin2();
				winlinec();
				document.getElementsByClassName('btn')[com].value ="o";
				document.getElementsByClassName('btn')[com].disabled = "true";
				
				if(count<8) {
					document.getElementsByClassName('btn')[com].value ="o";
				}
				return btnDisabled()
			}
			else {
				j--;
			}
		}
	}
	
	function pwin() {
		for( var s =0 ; s<=6 ; s+=3 ) {
			if(document.getElementsByClassName('btn')[s].value=="x"){
				if(document.getElementsByClassName('btn')[s].value === document.getElementsByClassName('btn')[s+1].value && document.getElementsByClassName('btn')[s+1].value ===
					document.getElementsByClassName('btn')[s+2].value )
			 {
						alert("플레이어승리")
						location.reload();
			 }
	
			}

		}
	}
	
	function pwin2() {
		for( var s = 0 ; s<=2 ; s++ ) { // * i는 0부터 2까지 1씩증가 -> 0 1 2 -> 3회
			if(document.getElementsByClassName('btn')[s].value=="x"){
				if(document.getElementsByClassName('btn')[s].value === document.getElementsByClassName('btn')[s+3].value && document.getElementsByClassName('btn')[s+3].value ===
					document.getElementsByClassName('btn')[s+6].value )
			 {
						alert("플레이어승리")
						location.reload();
			 }
	
			}
		}
		
	}
	
	function cwin() {
		for( var s =0 ; s<=6 ; s+=3 ) 
		{
			if(document.getElementsByClassName('btn')[s].value=="o"){
				if(document.getElementsByClassName('btn')[s].value === document.getElementsByClassName('btn')[s+1].value && document.getElementsByClassName('btn')[s+1].value ===
					document.getElementsByClassName('btn')[s+2].value )
			 {
						alert("컴퓨터승리")
						location.reload();
			 }
				
				
			}
			
		
		}

	}
	
	function cwin2() {
		for( var s = 0 ; s<=2 ; s++ ) { // * i는 0부터 2까지 1씩증가 -> 0 1 2 -> 3회
			if(document.getElementsByClassName('btn')[s].value=="o"){
				if(document.getElementsByClassName('btn')[s].value === document.getElementsByClassName('btn')[s+3].value && document.getElementsByClassName('btn')[s+3].value ===
					document.getElementsByClassName('btn')[s+6].value )
			 {
						alert("플레이어승리")
						location.reload();
			 }
	
			}
		}
		
	}
	
	function winline() {
		if(document.getElementsByClassName('btn')[4].value==="x"){
			if( document.getElementsByClassName('btn')[0].value === document.getElementsByClassName('btn')[4].value && document.getElementsByClassName('btn')[4].value == document.getElementsByClassName('btn')[8].value ) {
				alert("플레이어승리")
				location.reload();
			}
			if( document.getElementsByClassName('btn')[2].value === document.getElementsByClassName('btn')[4].value && document.getElementsByClassName('btn')[4].value == document.getElementsByClassName('btn')[6].value) {
				alert("플레이어승리")
				location.reload();
			}
		
			
		}
		
		
	}
	
	function winlinec() {
		if(document.getElementsByClassName('btn')[4].value==="o"){
			if( document.getElementsByClassName('btn')[0].value === document.getElementsByClassName('btn')[4].value && document.getElementsByClassName('btn')[4].value == document.getElementsByClassName('btn')[8].value ) {
				alert("컴퓨터승리")
				location.reload();
			}
			if( document.getElementsByClassName('btn')[2].value === document.getElementsByClassName('btn')[4].value && document.getElementsByClassName('btn')[4].value == document.getElementsByClassName('btn')[6].value) {
				alert("컴퓨터승리")
				location.reload();
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