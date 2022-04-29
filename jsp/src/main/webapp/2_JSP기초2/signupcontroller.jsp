<%@page import="Dao.Dao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    // 컨트롤 페이지로 사용
        	
        	// request : 요청 [ 서버가 --> 클라이언트 ]
        	request.setCharacterEncoding("UTF-8");
          String id=   request.getParameter("id");
          String password = request.getParameter("password");
          String name = request.getParameter("name");
          
          Member member = new Member(0,id,password,name);
          
          Dao memberDao = new Dao();
          
          boolean result = memberDao.signup(member);
          
          if(result){
             response.sendRedirect("main.jsp");
          }
    %>