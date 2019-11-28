package com.ty.jdbcappproperties;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DeleteQuerryWithProperties {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;
//		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="delete from employee_info where id=?";
		try
		{
			reader=new FileReader("db.properties");
			Properties p=new Properties();
			p.load(reader);
			String driverPt=p.getProperty("driver-class-name");
			Class.forName(driverPt);
			String url = p.getProperty("url");
			
			con=DriverManager.getConnection(url,p);
			pstmt=con.prepareStatement(p.getProperty("delete-query"));
			
			
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
