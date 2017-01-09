<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="cm.java.bean.Student"%>
<%@ page import="cm.java.Sevet.StudentSevet"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生管理系统主界面</title>
<link rel="stylesheet" type="text/css" href="../css/StudentMain.css">
<script src="../js/jquery-1.10.2.min.js"></script>
<script src="../js/Welcome.js"></script>
<% StudentSevet s=new StudentSevet();%>
<% ArrayList<Student> studentList = s.getStudent();%>
</head>
<body>
	<div class="title">
		<h1>欢迎进入学生管理系统</h1>
	</div>

	<div class="list">
		<ul>
			<li><a href="./AddStudent.jsp">添加学生</a></li>
			<li><a href="/StudentSevet?order=2">显示学生列表</a></li>
			<li><a href="./FindStudent.jsp">查找学生</a></li>
			<li><a href="./Login.jsp">退出系统</a></li>
		</ul>
	</div>
	 <div class="ShowStudent">
		<table>
			<tr>
				<th>姓名</th>
				<th>学号</th>
				<th colspan="2">操作</th>
			</tr>
			<% for(Student student:studentList) { %>
			<tr>
				<td><%=student.getName()%></td>
				<td><%=student.getNumber()%></td>
				<td><a href="/StudentSevet?order=4?"<%=student.getNumber()%>>删除</a></td>
			</tr>
			<%} %>

		</table>
	</div>

</body>
</html>