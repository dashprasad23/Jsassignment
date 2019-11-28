package com.tyss.jdbcapp;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		String path="db.properties";
		FileReader reader=null;
		
		try {
			reader=new FileReader(path);
			Properties properties=new Properties();
			properties.load(reader);
			//Step1:Load and resistered the driver
			String driverName=properties.getProperty("driver-class-name");
			Class.forName(driverName);
			//step2:Get the connection
			String url=properties.getProperty("url");
			String user=properties.getProperty("user");
			String password=properties.getProperty("password");
		    conn=DriverManager.getConnection(url,user,password);
			//Step3:issue SQL querries
		    String sql=properties.getProperty("select-querry");
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
		catch(Exception e)
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
				if(reader!=null)
				{
					reader.close();
				}
			}
			catch(SQLException | IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
