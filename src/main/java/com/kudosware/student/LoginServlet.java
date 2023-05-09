package com.kudosware.student;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/log")
public class LoginServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		try 
		{
			String uname=req.getParameter("uname");
			String pass=req.getParameter("pass");
			boolean val=Validator.isValid(uname, pass);
			if (val==true && uname.equals("admin")) 
			{
				res.sendRedirect("admin.jsp");
			}
			else if(val==true)
			{
				res.sendRedirect("home.jsp");
			}
			else
			{
				res.sendRedirect("login.jsp");
			}
		} 
		catch (Exception e) 
		{
			
		}
	}
}
