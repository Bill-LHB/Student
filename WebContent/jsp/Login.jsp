<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>登录界面</title>
		<link rel="stylesheet" type="text/css" href="../css/Login.css">
		<script src="../js/jquery-3.1.1.min.js"></script>
		<script src="../js/Login.js"></script>
	</head>
	<body class="body">
		<div class="title">
			<h1>欢迎进入四川大学学生管理系统</h1>
		</div>
		<div>
			<form action="<%=request.getContextPath()%>/loginSevet" method="POST" class="main" onsubmit="return check()">
				<span class="label">账&nbsp;号</span>
				<input type="text"  id="UresName" class="input" placeholder="请输入账号" name="UresName">
				<span id="UresNameHint" class="Hint"></span>
				<br/>
				<span class="label">密&nbsp;码</span>
				<input type="password" id="Password" class="input" placeholder="请输入密码" name="Password">
				<span id="PasswordHint" class="Hint"></span>
				<br/>
				<input class="submit" type="submit" value="登录">
			</form>
		</div>
	</body>
</html>