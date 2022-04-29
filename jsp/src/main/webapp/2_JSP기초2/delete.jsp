<%@page import="Dao.Dao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    request.setCharacterEncoding("UTF-8");
        
       		String id = (String)session.getAttribute("loginid");
         	
       		Dao memberDao = new Dao();
       		
       		boolean result = memberDao.delete(id);
       		
       		
       		if(result){
       			session.setAttribute("loginid", null);
       			response.sendRedirect("main.jsp");
       		}
    %>