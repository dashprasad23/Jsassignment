package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQueries {

	public static void main(String[] args) 
	{
		Connection conn=null;
		//Statement stmt=null;
		PreparedStatement pstmt=null;
		try {
			//step 1
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			//step 2
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn=DriverManager.getConnection(url);
			//step 3 issue Sql query
			String sql="insert into employee_info values(?,?,?,?)";
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
			
		}catch(SQLException e)
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

	}//end of main()

}//end of ExecuteInsertQuery
