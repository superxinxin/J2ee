<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
    session.setAttribute("SessionTest", 1);
    session.setAttribute("SessionTest", 2);
    session.removeAttribute("SessionTest");
%>