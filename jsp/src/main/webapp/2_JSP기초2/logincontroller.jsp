<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	Dao memberDao =new Dao();
	boolean result = memberDao.login(id, password);
	
	if(result) {
		response.sendRedirect("main.jsp");
		session.setAttribute("loginid", id);
		// 서블릿 내장객체 : session
		
		System.out.print("성공");
	} else{
		response.sendRedirect("main.jsp");
	}
%>