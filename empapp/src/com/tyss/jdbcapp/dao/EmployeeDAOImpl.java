package com.tyss.jdbcapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tyss.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDao {
	public ArrayList<EmployeeBean> getAllEmployeedata()
	{
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info";
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		ArrayList<EmployeeBean> result=new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				
				result.add(bean);
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(con!=null)
				{
					con.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
				if(rs!=null)
				{
					rs.close();
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		return result;
	}//end of getAllEmployeedata()
	
	public EmployeeBean searchEmployeeData(int id)
	{
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee_info where id="+id;
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(sql);
//			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSalary(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}
			else
			{
				return null;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally {
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
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		
	
		return 0;
		
		
	}

	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="update employee_info set name=?,sal=?,genser=? where id=? ";
		Connection con=null;
		ResultSet res=null;
		PreparedStatement pstmt=null;
		try {
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(sql);
			int Empid=bean.getId();
			pstmt.setInt(4, Empid);
			String name=bean.getName();
			pstmt.setString(1, name);
			int sal=bean.getSalary();
			pstmt.setInt(2, sal);
			String gender=bean.getGender();
			pstmt.setString(3,gender);
			int count=pstmt.executeUpdate();
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		finally {
			try {
				if(con!=null)
				{
					con.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
				if(res!=null)
				{
					res.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		//return 0;
	}

	@Override
	public int deleteEmployeeData(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
