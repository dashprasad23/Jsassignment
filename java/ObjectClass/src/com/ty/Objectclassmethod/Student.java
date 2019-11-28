package com.ty.Objectclassmethod;

public class Student {
	
	int id;
	String name;
	double percentage;
	public Student(int id,String name,double percentage)
	{
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	
	public int hashcode()
	{
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	

}
