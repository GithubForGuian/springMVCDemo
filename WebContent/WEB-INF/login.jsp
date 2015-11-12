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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="<%=basePath + "js/jquery-1.7.2.js"%>"></script>
<script type="text/javascript" src="<%=basePath + "js/onlinebook.js"%>"></script>
<body>
<span style="color:red">${msg}</span><br/>
<form action="login.jhtml" method="post">
用户名：<input type="text" name="cusId" id="cusId"/><br/>
密    码: <input type="password" name="cusPassword" id="cusPassword"/><br/>
</form>
<button onclick="sub()">提交</button>&nbsp;&nbsp;<button onclick="reset()">重置</button>
</body>
</html>