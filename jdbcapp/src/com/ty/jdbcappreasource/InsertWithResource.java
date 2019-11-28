package com.ty.jdbcappreasource;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;


public class InsertWithResource {

	public static void main(String[] args) {
		try(FileReader reader=new FileReader("db.properties"))
		{
			Properties p=new Properties();
			p.load(reader);
			Class.forName(p.getProperty("driver-class-name"));
			String url=p.getProperty("url");
			//Connection con=null;
			try(Connection con=DriverManager.getConnection(url,p);
					PreparedStatement pstmt=con.prepareStatement(p.getProperty("insert-query")))
			{
				String empid=args[0];
				int id=Integer.parseInt(empid);
				pstmt.setInt(1,id);
				
				String name=args[1];
				pstmt.setString(2,name);
				
				String sal=args[2];
				int salary=Integer.parseInt(sal);
				pstmt.setInt(3, salary);
				
				String gender=args[3];
				pstmt.setString(4, gender);
				
				
				int count=pstmt.executeUpdate();
				//step 4 read the result
				System.out.println(count+" Row(s) inserted");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
