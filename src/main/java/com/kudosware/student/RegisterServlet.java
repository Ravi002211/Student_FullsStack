package com.kudosware.student;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kudosware.dbhandler.DataInjector;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		try 
		{
			String uname=req.getParameter("uname");
			String pass=req.getParameter("pass");
			String mail=req.getParameter("mail");
			String gender=req.getParameter("gender");
			String address=req.getParameter("address");
			String file=req.getParameter("file");
			String status=DataInjector.addStudent(uname, pass, mail,
					gender, address, file);
			res.sendRedirect("login.jsp");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
