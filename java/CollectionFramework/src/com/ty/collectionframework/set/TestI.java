package com.ty.collectionframework.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		SortBYName s=new SortBYName();
		SortByMicr s1=new SortByMicr();
		SortByPin s2=new SortByPin();
		TreeSet<Bank> ts=new TreeSet<Bank>(s);
		Bank b1=new Bank("HDFC",560068,6768689);
		Bank b2=new Bank("SBI",560071,989898);
		Bank b3=new Bank("CITI",560054,765678);
		Bank b4=new Bank("CANARA",560076,123456);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		System.out.println("*****************Using Iterator**************************");
		Iterator<Bank> i=ts.iterator();
		while(i.hasNext())
		{
			Bank b=i.next();
			System.out.println("bank name"+b.name);
			System.out.println("Bank pin "+b.pincode);
			System.out.println("Bank Micr"+b.accountno);
		}
		
		
		
		
	}

}
