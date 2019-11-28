package com.ty.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(23);
		hs.add(34);
		hs.add("deepa");
		hs.add(56.7);
		hs.add(true);
		hs.add(56.7);//Hashset dos't allow duplicate
		hs.add(null);
		hs.add(null);//Hashset allow maximum one null value
		System.out.println("*********************************** Using for each***********************************");
		for(Object o:hs)
		{
			System.out.println(o);
		}
		System.out.println("*****************************Using iterator****************************************");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}
		
		
	}

}
