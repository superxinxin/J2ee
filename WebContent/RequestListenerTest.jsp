<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
    request.setAttribute("RequestListenerTest", 1);
    request.setAttribute("RequestListenerTest", 2);
    request.removeAttribute("RequestListenerTest");
%>