<%@page import="Dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
   <%
  
   request.setCharacterEncoding("UTF-8");
  	int bnum = (int)session.getAttribute("bnum2");
  	System.out.println("수정완료 "+bnum);
  	
      String title = request.getParameter("title");
      String content = request.getParameter("content");
      
      Dao dao = new Dao();
      
      boolean result = dao.update(bnum, title, content);
      
      if(result){
      	
      	response.sendRedirect("main.jsp");
      	session.setAttribute("bnum2", null);
      }
      %>