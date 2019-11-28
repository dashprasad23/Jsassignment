package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ExecuteQuerry {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="update employee_info set name=?,sal=?,gender=? where id=?";
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(sql);
			
			String Empid=args[3];
			int id=Integer.parseInt(Empid);
			pstmt.setInt(4, id);
			
			String Empname=args[0];
			
			pstmt.setString(1,Empname);
			
			String sal=args[1];
			int salary=Integer.parseInt(sal);
			pstmt.setInt(2, salary);
			
			String gender=args[2];
			
			pstmt.setString(3, gender);
			
			int count=pstmt.executeUpdate();
			System.out.println(count+" rows affected");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{

			try {
				if(con!=null)
				{
					con.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
