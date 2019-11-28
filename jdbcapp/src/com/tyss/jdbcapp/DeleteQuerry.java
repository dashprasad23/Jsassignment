package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteQuerry {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="delete from employee_info where id=?";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(sql);
			
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int count=pstmt.executeUpdate();
			System.out.println(count+" rows deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(con!=null)
				{
					con.close();
				}
				if(pstmt!=null)
				{
					con.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
