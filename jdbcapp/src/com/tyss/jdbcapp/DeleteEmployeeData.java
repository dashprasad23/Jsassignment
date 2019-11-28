package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DeleteEmployeeData {

	public static void main(String[] args) {
		Connection cnn=null;
		Statement stmt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			cnn=DriverManager.getConnection(url);
			String sql="delete from employee_info where id=6";
			stmt=cnn.createStatement();
			int count=stmt.executeUpdate(sql);
			System.out.println(count+" rows affected");
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(cnn!=null)
				{
					cnn.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
