package com.tyss.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;


public class MyFirstJdbc {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//Step1:Load and resistered the driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			//step2:Get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
		    conn=DriverManager.getConnection(url,"root","root");
			
			//Step3:issue SQL querries
			String sql="select * from employee_info";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			//step4:Read the result
			while(rs.next())
			{                                                                               
				int id=rs.getInt("id");//column number
				String name=rs.getString("name");//column name
				int sal=rs.getInt("sal");//column name
				String gender=rs.getString("Gender");//column name
				
				System.out.println("Id:"+id);
				System.out.println("Name:"+name);
				System.out.println("Salary:"+sal);
				System.out.println("Gender:"+gender);
				
				System.out.println("********************************************");
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			//Step5:close all the JDBC resources
			try {
				if(conn!=null)
				{
					conn.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
