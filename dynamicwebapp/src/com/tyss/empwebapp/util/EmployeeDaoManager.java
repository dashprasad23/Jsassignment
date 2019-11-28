package com.tyss.empwebapp.util;

import com.tyss.empweb.dao.EmployeeDAO;
import com.tyss.empweb.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {
	
	private EmployeeDaoManager() {}
	
	public static EmployeeDAO getEmployeeDAO()
	{
		return new EmployeeDaoJdbcImpl();
	}

}
