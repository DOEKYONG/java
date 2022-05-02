<%@page import="dto.Board"%>
<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	int bnum = Integer.parseInt(request.getParameter("bno"));
	session.setAttribute("bnum2", bnum); 
	
	Dao dao = new Dao();
	Board board = dao.get(bnum);
	%>
	<form action="bupdatecontroller.jsp?bno=<%=bnum%>" method="get">
		제목: <input type="text" name="title" value="<%=board.getBtitle()%>"><br>
		내용: <textarea rows="5" cols="10" name="content"><%=board.getBcontent()%></textarea>
		<input type="submit" value="수정완료">
	</form>

</body>
</html>