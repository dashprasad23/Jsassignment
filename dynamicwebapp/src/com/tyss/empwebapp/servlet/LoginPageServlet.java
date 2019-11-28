package com.tyss.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		String id="";
		Cookie[] cookies=req.getCookies();
		if(cookies!=null)
		{
			for(Cookie cookie:cookies)
			{
				if(cookie.getName().equals("alwaysRemember"))
				{
					id=cookie.getValue();
				}
			}
		}
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<style>");
		out.println("#f1{");
		out.println("border:1px solid black;");
		out.println("height:259px;");
		out.println("width:284px;");
		out.println("margin-left:275px;");
		out.println("margin-top:94px;");
		out.println("padding-top:4px;");
		out.println("padding-left:100px;");
		out.println("}");
		out.println("</style>");
		out.println("<body>");
		out.println("<form id='f1' action='./login' method='post'>");
		out.println("<h2>Login hear</h2>");
		out.println("<input type='text' name='id' placeholder='enter your id...'value='"+id+"'><br><br>");
		out.println("<input type='password' name='password' placeholder='enter your password...'><br><br>");
		out.println("Remember me:<input type='checkbox' name='remember' value='check'><br><br>");
		out.println("<input type='Submit' name='Submit' value='Login'><br><br>");
		out.println("<a href=\"register.html\">Register</a>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	
	}

}
