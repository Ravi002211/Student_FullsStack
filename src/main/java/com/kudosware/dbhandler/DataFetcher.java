package com.kudosware.dbhandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataFetcher 
{
	public static String fetchPassword(String uname)
	{
		String path="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="SELECT pass FROM KUDOSWARE WHERE uname=?";
		String dbPass="";
		try 
		{
			Class.forName(path);
			con=DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,uname);
			rs=pstmt.executeQuery();
			if(rs.next()==true) 
			{
			dbPass=rs.getString("pass");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Login issues");
			e.printStackTrace();
		}
		return dbPass;
	}
}
