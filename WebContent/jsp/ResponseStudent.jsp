<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>显示学生信息</title>
	</head>
	<body>
		<div class="title">
			<h1>学生列表</h1>
		</div>
		<div class="studentInformation">
			<table>
				<tr>
					<td>学生姓名</td>
					<td>学生学号</td>
					<td>操作</td>				
				</tr>
				 <% {%>
					<td>学生姓名</td>
					<td>学生学号</td>
					<td>操作</td>		
				<%} %>					
			</table>
		</div>
	</body>
</html>