package com.TY.beanObject.bin;

public class TestA {

	public static void main(String[] args) {
		Student s=new Student();
		s.setID(12);
		s.setName("Hitler");
		s.setRollNo(134);
		Database db=new Database();
		db.receive(s);
		

	}

}
