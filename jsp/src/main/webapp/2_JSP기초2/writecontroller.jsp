<%@page import="Dao.Dao"%>
<%@page import="dto.Board"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = (String)session.getAttribute("loginid"); 
	// 작성자는 로그인 성공시 세션에서 가져오기
	// 세션 호출시 기본자료형이 object -> 형변환 (1.자동형변환 2.강제형변환 )
	Date now = new Date(); SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	String date = sf.format(now); // 현재 날짜/시간 포맷하기 
		
	// 변수 -> 객체화
	Board board= new Board(0,title,content,writer,date);
	// dao
	Dao dao = new Dao();
	// 메소드 실행
	boolean result =dao.write(board);
	if(result) {
		response.sendRedirect("main.jsp");
		
	}
	
%>