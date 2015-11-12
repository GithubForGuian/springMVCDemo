<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page import="java.util.*,java.text.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<base href="<%=basePath%>">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主界面</title>
</head>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="<%=basePath + "js/jquery-1.7.2.js"%>"></script>
<script type="text/javascript" src="<%=basePath + "js/onlinebook.js"%>"></script>
<body>
<div><span>顾客姓名：${cus.cusName}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>订单数量/未发订单数${bookform.order}/${bookform.lOrder}</span></div>
<div style="margin:0;padding:0; width:80%;height:1px;background-color:#EFEFEF;overflow:hidden;margin-top: 15px;"></div>
可选购的书籍
<table class="table">
	<tr class="table_header">
		<td>书籍编号</td>
		<td>书籍名</td>
		<td>书籍作者</td>
		<td>书籍价格</td>
		<td>出版社</td>
		<td>上市日期</td>
	</tr>
	<c:forEach items="${bookform.books}" var="book" varStatus="s">
		<tr class="row${s.index%2+1}">
		    <td>${book.bookSN}</td>
			<td>${book.bookName}</td>
			<td>${book.bookAuthor}</td>
			<td>${book.bookPrice}</td>
			<td>${book.pubName}</td>
			<td><fmt:formatDate value="${book.createDate}" pattern="yyyy-MM-dd"/></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>