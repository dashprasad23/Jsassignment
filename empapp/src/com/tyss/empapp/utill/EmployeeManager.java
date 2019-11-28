package com.tyss.empapp.utill;

import com.tyss.jdbcapp.dao.EmployeeDAOImpl;


public class EmployeeManager {
	private EmployeeManager()
	{
		
	}
	
	public static EmployeeDAOImpl getEmployeeDao()
	{
		return new  EmployeeDAOImpl();
	}

}
