package com.ty.objectClass;

public class Person implements Cloneable {
	
	int id;
	String name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	public Person(int id,String name)
	{
		this.id=id;
		this.name=name;
		
		
	}

}
