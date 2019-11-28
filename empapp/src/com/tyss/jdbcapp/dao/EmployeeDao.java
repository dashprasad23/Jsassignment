package com.tyss.jdbcapp.dao;

import java.util.List;

import com.tyss.empapp.dto.EmployeeBean;

public interface EmployeeDao {
	
	public List<EmployeeBean> getAllEmployeedata();
	public EmployeeBean searchEmployeeData(int id);
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);

}
