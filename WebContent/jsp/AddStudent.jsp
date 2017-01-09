<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>添加学生</h1>
	</div>
	<div>
			<form action="../StudentSevet" class="main" onsubmit="return check()">
				<span class="label">姓&nbsp;名</span>
				<input type="text"  id="UresName" class="input" placeholder="请输入姓名" name="name">
				<span id="UresNameHint" class="Hint"></span>
				<br/>
				<span class="label">学&nbsp;号</span>
				<input type="password" id="Password" class="input" placeholder="请输入学号" name="number">
				<span id="PasswordHint" class="Hint"></span>
				<br/>
				<input type="hidden" name="order" value="1"/>
				<input class="submit" type="submit" value="提交">
			</form>
		</div>
</body>
</html>