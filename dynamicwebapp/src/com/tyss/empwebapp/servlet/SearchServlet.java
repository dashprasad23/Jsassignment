package com.tyss.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.empweb.dao.EmployeeDAO;
import com.tyss.empwebapp.dto.EmployeeInfo;
import com.tyss.empwebapp.util.EmployeeDaoManager;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("search"));
		//PrintWriter out=resp.getWriter();
		HttpSession sess=req.getSession(false);
		if(sess == null) {
			//out.println("Something went wrong!!!");
			RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
			dispatcher.include(req, resp);
		}

		EmployeeDAO dao=EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info=dao.searchEmployee(id);
		req.setAttribute("info",info);
		RequestDispatcher dispatcher=req.getRequestDispatcher("/Search.jsp");
		dispatcher.forward(req, resp);
		int id1=info.getId();
		String name=info.getName();
		String email=info.getEmail();
//		out.println("<html>");
//		out.println("<body>");
//		if(info!=null)
//		{
//			out.println("<table border='1px solid black'>");
//			out.println("<tr>");
//			out.println("<th>ID</th>");
//			out.println("<th>name</th>");
//			out.println("<th>email</th>");
//			out.println("</tr>");
//			out.println("<tr>");
//			out.println("<td>"+id1+"</td>");
//			out.println("<td>"+name+"</td>");
//			out.println("<td>"+email+"</td>");
//			out.println("</tr>");
//			out.println("</table>");
//		} else {
//			out.println("<h2>No data found</h2>");
//
//		}
//		out.println("</body>");
//		out.println("</html>");
	}
}
