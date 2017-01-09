package cm.java.Sevet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginSevet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("UresName");
	int password=Integer.parseInt(req.getParameter("Password"));
	if(name.equals("admin") && password==123456){
		resp.sendRedirect("jsp/StudentMain.jsp");
	}else{
		resp.sendRedirect("jsp/Login.jsp");
	}
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req,resp);
	}
}
