<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
			<%@include file ="../header.jsp" %>

	<div class="container">
		<h3> 자유게시판 </h3>
		
		<%
			String mid = (String)session.getAttribute("login");
			if( mid != null ){
		%>
			<a href="../board/boardwrite.jsp"> 글쓰기 </a>
		<%} %>
		
		<table class="table"> <!-- 테이블 -->
			<tr>
				<th> 번호 </th> <th> 제목 </th> <th> 작성자 </th> 
				<th> 조회수  </th> <th> 작성일 </th> 
			</tr>
			<!-- for 문 -->
			<%
				Date nowDate = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String now = simpleDateFormat.format(nowDate);
					
				
					
			
				// 1. 모든 게시물  호출 
				ArrayList<Board> boardlist = 
					BoardDao.getBoardDao().getboardlist();
					System.out.println( boardlist);
				for( Board board : boardlist ){
					System.out.println( board.toString() );
					String date = board.getBdate().substring(0,10);
					if(!now.equals(date)) {
						date = board.getBdate().substring(0,10);
					}else {
						date = board.getBdate().substring(10);
					}
					
				
			%>
				<!-- 행을 클릭했을때 [ js ]
					<tr onclick = " 'location.href="boardview.jsp'">
						*링크 [ 식별 번호 같이 이동 ]
							// 1.HTML :파일명(경로).jsp? 변수명=값
							// 2. JS : "location.href='파일명(경로).jsp?변수명=값'"
							// 3. java : resopnse.sendRedirect("파일명(경로).jsp?변수명=값");
				 -->
				<% if(mid.equals(board.getMid())) { %>
					
					<tr onclick=" location.href='../board/boardview.jsp?bno=<%=board.getBno()%>'">
					<td> <%=board.getBno()%>  </td>
					<td> <%=board.getBtitle() %> </td>
					<td> <%=board.getMid() %> </td>
					<td> <%=board.getBview() %> </td>
					<td> <%=date %> </td>
				</tr>
			<%
				}
			%>
				<% }%>

			
			
			
		</table>
	</div>
	
	
	<%@include file ="../footer.jsp" %>
	
	

</body>
</html>