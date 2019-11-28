package com.tyss.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.empweb.dao.EmployeeDAO;
import com.tyss.empwebapp.dto.EmployeeInfo;
import com.tyss.empwebapp.util.EmployeeDaoManager;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		EmployeeInfo info=new EmployeeInfo();
		info.setId(id);
		info.setEmail(email);
		info.setName(name);
		info.setPassword(password);
		EmployeeDAO dao=EmployeeDaoManager.getEmployeeDAO();
		boolean check=dao.registerEmployee(info);
		
		PrintWriter out=resp.getWriter();
		String msg="";
		
		if(check)
		{
//			out.println("<html>");
//			out.println("<body>");
//			out.println("<h4>Register Completed</h4>");
//			out.println("</body>");
//			out.println("</html>");
			msg="Registration Completed";
			
			
			
		}else
		{
//			out.println("<html>");
//			out.println("<body>");
//			out.println("<h4>Id cannot be repeted</h4>");
//			out.println("</body>");
//			out.println("</html>");
			msg="Id can't be repeted";
		}
		RequestDispatcher dispatcher=req.getRequestDispatcher("./login.jsp");
		
		dispatcher.forward(req, resp);
		
		
		
		
	}//end of do post

}//end of registerServlet
