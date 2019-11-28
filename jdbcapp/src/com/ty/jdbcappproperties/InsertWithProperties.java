package com.ty.jdbcappproperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class InsertWithProperties {

	public static void main(String[] args) {
		Connection conn=null;
		//Statement stmt=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;
		try {
			reader=new FileReader("db.properties");
			Properties p=new Properties();
			p.load(reader);
			//step 1
			Class.forName(p.getProperty("driver-class-name"));
			//step 2
			String url=p.getProperty("url");
			conn=DriverManager.getConnection(url,p.getProperty("user"),p.getProperty("password"));
			//step 3 issue Sql query
			String sql=p.getProperty("insert-query");
			pstmt=conn.prepareStatement(sql);
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
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		try {
			if(conn!=null)
			{
				conn.close();
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
