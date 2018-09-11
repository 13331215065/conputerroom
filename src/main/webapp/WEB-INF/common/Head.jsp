<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%
   String basePath="";
   if(request.getServerPort()!=80){
	   basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
   }else{
	   basePath=request.getScheme()+"://"+request.getServerName()+request.getContextPath();
   }
  pageContext.setAttribute("basePath", basePath);  
%>