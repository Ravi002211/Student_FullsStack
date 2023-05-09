package com.kudosware.dbhandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DataInjector 
{
	public static String addStudent(String uname,String pass,String mail,
			String gender,String address,String file)
	{
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		String sql="INSERT INTO KUDOSWARE VALUES(?,?,?,?,?,?)";
		String regStatus="";
		Connection con=null;
		PreparedStatement pstmt=null;
		try 
		{
			Class.forName(path);
			con=DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,uname);
			pstmt.setString(2,pass);
			pstmt.setString(3,mail);
			pstmt.setString(4,gender);
			pstmt.setString(5,address);
			pstmt.setString(6,file);
			pstmt.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println("Error in Registration");
			e.printStackTrace();
			regStatus="fail";
		}
		finally 
		{
			return regStatus;
		}
	}
}
