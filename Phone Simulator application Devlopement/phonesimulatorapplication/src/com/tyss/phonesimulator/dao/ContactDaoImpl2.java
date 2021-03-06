package com.tyss.phonesimulator.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.tyss.phonesimulator.app.Test;

public class ContactDaoImpl2 implements ContactDao2 {

	@Override
	public String call() {
		int num=0;
		String url="jdbc:mysql://localhost:3306/contactFile?user=root&password=root";
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the number to start the call");
		Long number=t.nextLong();
		String st="";
		Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
		String sql="select * from contacts where Number="+number;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs!=null)
			{
				st="Call started";
			}
			else
			{
				st="no contact exist";
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
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
			if(stmt!=null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if(rs==null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	
		return st;
	}

	@Override
	public void message() {
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your message");
		String msg=t.nextLine();
		System.out.println("press 1 to send the message");
		int q=t.nextInt();
		if(q==1)
		{
			System.out.println("Message sent successfully");
			System.out.println(msg);
			
		}
		
	}

	@Override
	public void mainManu() {
		Test t=new Test();
		t.main(null);
		
	}

}
