package com.tyss.phonesimulator.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ContactDaoImpl3 implements ContactDao3{

	@Override
	public int add() {
		String url="jdbc:mysql://localhost:3306/contactFile?user=root&password=root";
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Contact name");
		String name=s.next();
		System.out.println("Enter the Contact number");
		Long number=s.nextLong();
		System.out.println("Enter the contact group");
		String group=s.next();
		String sql="insert into contacts values("+"'"+name+"'"+","+number+","+"'"+group+"'"+")";
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(sql);
			c=pstmt.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
			return 0;
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		if(pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return c;
	}

	@Override
	public int delete() {
		String url="jdbc:mysql://localhost:3306/contactFile?user=root&password=root";
		int c=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the person name to Delete");
		String name=t.next();
		
		String sql="Delete from contacts where Name='"+name+"'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(sql);
			c=pstmt.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return 0;
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		if(pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return c;
		
		
	}

	@Override
	public int edit() {
		int c=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		String url="jdbc:mysql://localhost:3306/contactFile?user=root&password=root";
		System.out.println("Enter the contact name to update");
		Scanner st=new Scanner(System.in);
		String name=st.next();
		System.out.println("Enter the new Contact number");
		Long number=st.nextLong();
		
		//"update employee_info set name='ABC',sal=50,gender='o' where id=6"
		String sql="update contacts set Number="+number+" where Name='"+name+"'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(sql);
			c=pstmt.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return 0;
		}
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		return c;
		
		
	}

	

}
