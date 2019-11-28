package com.ty.jdbcappreasource;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class UpdateUsingResource {

	public static void main(String[] args) {
		try(FileReader f=new FileReader("db.properties"))
		{
			Properties p=new Properties();
			p.load(f);
			String url=p.getProperty("url");
			String sql=p.getProperty("update-query");
			Class.forName(p.getProperty("driver-class-name"));
			try(Connection con=DriverManager.getConnection(url,p);
					PreparedStatement pstmt=con.prepareStatement(sql))
			{
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
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
