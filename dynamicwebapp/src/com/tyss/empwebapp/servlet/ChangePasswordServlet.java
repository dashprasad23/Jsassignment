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
@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	     HttpSession session=req.getSession(false);
	     if(session!=null)
	     {
	    	 String pass=req.getParameter("newPassword");
	    	 String confirmPass=req.getParameter("conformPassword");
	    	 if(pass.equals(confirmPass))
	    	 {
	    		 PrintWriter out=resp.getWriter();
	    		 EmployeeInfo info=(EmployeeInfo)session.getAttribute("info");
	    		 EmployeeDAO dao=EmployeeDaoManager.getEmployeeDAO();
	    		 dao.changePassword(info.getId(), pass);
	    		 RequestDispatcher dispatcher=req.getRequestDispatcher("/home.jsp");
	    		 
	    		 dispatcher.forward(req, resp);
	    	 }else
	    	 {
	    		 String msg="Password not matching";
	    		 req.setAttribute("msg",msg);
	    		 
	    		 RequestDispatcher dispatcher=req.getRequestDispatcher("/changepassword.jsp");
	    		 dispatcher.forward(req,resp);
	    	 }
	    	
	    	 
	     }
	     else
	     {
	    	 RequestDispatcher dispatcher=req.getRequestDispatcher("/Login.html");
	    	 dispatcher.forward(req, resp);
	     }
		
		
		
		
		
		
	}//end of doPost()
	

}//end of ChangePasswordServlet
