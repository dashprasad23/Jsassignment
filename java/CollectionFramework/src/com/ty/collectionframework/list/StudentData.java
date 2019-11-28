package com.ty.collectionframework.list;

public class StudentData {

	int StdId;
	String StudentName;
	double marks;
	@Override
	public String toString() {
		return "StudentData [StdId=" + StdId + ", StudentName=" + StudentName + ", marks=" + marks + "]";
	}
	public StudentData(int stdId, String studentName, double marks) {
		super();
		StdId = stdId;
		StudentName = studentName;
		this.marks = marks;
	}

}
