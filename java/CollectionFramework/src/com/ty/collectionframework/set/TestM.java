package com.ty.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestM {

	public static void main(String[] args) {
		SortByCname sc=new SortByCname();
		SortBySal sc1=new SortBySal();
		StoreById  sc2=new StoreById ();
		
		TreeSet<Customer> ts=new TreeSet<>(sc2);
		Customer c1=new Customer("Donald",1223,50000);
		Customer c2=new Customer("Robert",5667,30000);
		Customer c3=new Customer("Stalin",9008,40000);
		Customer c4=new Customer("Edward",2445,80000);
		Customer c5=new Customer("Putin",1110,60000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		System.out.println("_______________________By using Iterator_________________");
		Iterator<Customer> ct=ts.iterator();
		while(ct.hasNext())
		{
			Customer c=ct.next();
			System.out.println("Customer name "+c.cName);
			System.out.println("Customer id"+c.id);
			System.out.println("customer salary"+c.salary);
			System.out.println("______________________________________");
		}
		
		

	}

}
