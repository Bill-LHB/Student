package cm.java.Sevet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cm.java.Data.DataStudent;
import cm.java.bean.Student;

public class StudentSevet extends HttpServlet {
	private static final int ADD_STUDENT = 1;
	private static final int SHOW_STUDENT = 2;
	private static final int FIND_STUDENT = 3;
	private static final int DELETE_STUDENT = 4;
	DataStudent dataStudent = null;
	ArrayList<Student> studentList = null;

	@Override
	public void init() throws ServletException {
		dataStudent = DataStudent.getInstance();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		studentList = null;
		int order = Integer.parseInt(req.getParameter("order"));
		System.out.println("order:"+order);
		switch (order) {
		case ADD_STUDENT:
			String name = req.getParameter("name");
			int number = Integer.parseInt(req.getParameter("number"));
			Student stu = new Student(name, number);
			dataStudent.addStudent(stu);
			resp.sendRedirect("../StudentMain.jsp");
			break;
		case SHOW_STUDENT:
			studentList = dataStudent.getAllStudent();
			break;
		case FIND_STUDENT:
			int num = Integer.parseInt(req.getParameter("number"));
			studentList = dataStudent.getStudent(num);
			break;
		case DELETE_STUDENT:
			int n = Integer.parseInt(req.getParameter("number"));
			dataStudent.deleteStudent(n);
			resp.sendRedirect("../StudentMain.jsp");
			break;
		}
	}
	public ArrayList<Student> getStudent(){	
		ArrayList<Student> studentLists=studentList;
		studentList=null;
		return studentLists;
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
