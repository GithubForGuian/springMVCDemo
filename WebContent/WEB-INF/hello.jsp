<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>">
<head>
<title>Hello</title>
</head>

<script type="text/javascript" src="<%=basePath + "js/jquery-1.7.2.js"%>"></script>
<script type="text/javascript" src="<%=basePath + "js/my.js"%>"></script>

<body>
        <input name="name" id="name" value="ss"/>
		<button onclick="u()">提交</button>
</body>
</html>