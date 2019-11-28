package com.ty.collectionframework.list;

public class EmployeeObject {
	int empId;
	String empName;
	String jobRole;
	public EmployeeObject(int empId, String empName, String jobRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jobRole = jobRole;
	}
	@Override
	public String toString() {
		return "EmployeeObject [empId=" + empId + ", empName=" + empName + ", jobRole=" + jobRole + "]";
	}
	
	

}
