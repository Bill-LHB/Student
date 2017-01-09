<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>查找学生</h1>
	</div>
		<div>
			<form action="../StudentSevet?order=3" method="POST" class="main" onsubmit="return check()">
				<span class="label">请输入学生姓名或学号</span>
				<input type="text"  id="UresName"
				class="input"  name="UresName">
				<span id="UresNameHint" class="Hint"></span>
				<br/>
				<input class="submit" type="submit" value="查找">
			</form>
		</div>
</body>
</html>