package com.tyss.phonesimulator.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tyss.phonesimulator.dto.ContactBean;

public class ContactDaoImpl implements ContactDao{

	@Override
	public List<ContactBean> display() {
		String url="jdbc:mysql://localhost:3306/contactFile?user=root&password=root";
		String sql="select * from contacts";
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		List<ContactBean> li=new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			ContactBean bean=new ContactBean();
			
			while(rs.next())
			{
				bean.setName(rs.getString("Name"));
				bean.setNumber(rs.getInt("Number"));
				bean.setGroup(rs.getString("Group"));
				li.add(bean);
				
			
			}
			
			
			
			
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
			return null;
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(stmt!=null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return li;
		
		
		
	}

}
