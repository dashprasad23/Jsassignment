package com.tyss.empapp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.empapp.dto.EmployeeBean;
import com.tyss.empapp.utill.EmployeeManager;
import com.tyss.jdbcapp.dao.EmployeeDAOImpl;
import com.tyss.jdbcapp.dao.EmployeeDao;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search employee data");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			EmployeeDao emp=EmployeeManager.getEmployeeDao();
			List<EmployeeBean> arr=emp.getAllEmployeedata();
			for(EmployeeBean e:arr)
			{
				System.out.println("ID: "+e.getId());
				System.out.println("Name: "+e.getName());
				System.out.println("Salary: "+e.getSalary());
				System.out.println("Gender: "+e.getGender());
			}
			break;
		case 2:
			
			break;
		case 3:
			EmployeeDao emp3=EmployeeManager.getEmployeeDao();
			EmployeeBean bean1=new EmployeeBean();
			bean1.setId(4);
			int count=emp3.updateEmployeeData(bean1);
			System.out.println(count+" rows affected");
			break;
		case 4:
			break;
		case 5:
			EmployeeDao emp2=EmployeeManager.getEmployeeDao();
			int id=sc.nextInt();
			EmployeeBean bean=emp2.searchEmployeeData(id);
			if(bean!=null)
			{
				System.out.println("ID: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Salary: "+bean.getSalary());
				System.out.println("Gender: "+bean.getGender());
			}
			else
			{
				System.out.println("no data found");
			}
			break;
			
				
		}
		
	}//end of main method

}
