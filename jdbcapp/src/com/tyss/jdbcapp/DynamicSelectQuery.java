package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select *from employee_info where id=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//Statement stmt=null;
		
		try
		{
			Driver div=new Driver();
			DriverManager.registerDriver(div);//driver resistered
			
			con=DriverManager.getConnection(url);//connection established
			pstmt=con.prepareStatement(sql);//statement creted
			String empid=args[0];
			int id=Integer.parseInt(empid);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int id1=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("sal");
				String gender=rs.getString("Gender");
				
				System.out.println("Id:"+id1+" Name:"+name+" Salary:"+sal+" Gender:"+gender);
				
				System.out.println("********************************************");
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}finally
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
					if(rs!=null)
					{
						rs.close();
					}
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
			
		}

	}

}
