package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResource {

	public static void main(String[] args) {

		try(FileReader reader=new FileReader("db.properties"))
		{
			Properties p=new Properties();
			p.load(reader);
			Class.forName(p.getProperty("driver-class-name"));
			String url=p.getProperty("url");
			String sql=p.getProperty("select-querry");
			try(Connection con=DriverManager.getConnection(url,p);
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(sql))
			{
				while(rs.next())
				{
					System.out.println("ID: "+rs.getInt("id"));
					System.out.println("Name:"+rs.getString("name"));
					System.out.println("Salary:"+rs.getInt("sal"));
					System.out.println("Gender:"+rs.getString("gender"));
				}
			}
	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 




	}

}
