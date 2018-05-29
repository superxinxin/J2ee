<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
    application.setAttribute("ContextAttrbuteListenerTest", 1);
    application.setAttribute("ContextAttrbuteListenerTest", 2);
    application.removeAttribute("ContextAttrbuteListenerTest");
%>