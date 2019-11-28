package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class UpdateEmployeeData {

	public static void main(String[] args) {
	 
		Connection cnn=null;
		Statement st=null;
		try
		{
			Driver dvr=new Driver();
			DriverManager.registerDriver(dvr);
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			cnn=DriverManager.getConnection(url);
			String sql="update employee_info set name='ABC',sal=50,gender='o' where id=6";
			st=cnn.createStatement();
			int count=st.executeUpdate(sql);
			System.out.println(count+" rows updated");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(cnn!=null)
				{
					cnn.close();
				}
				if(st!=null)
				{
					st.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
