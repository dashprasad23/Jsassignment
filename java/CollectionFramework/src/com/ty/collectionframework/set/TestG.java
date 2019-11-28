package com.ty.collectionframework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestG {

	public static void main(String[] args) {
		
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(34);
		ls.add("nikita");
		ls.add(89.9);
		ls.add(34);
		ls.add("Bhavya");
		ls.add(null);                         /*
		                                            Duplicates are not allow in linked set,
		                                            maximum one null value is allow in linked set
		
		                                       */
		ls.add(null);
		
		System.out.println("***************************Using ForEach**************************");
		for(Object s:ls)
		{
			System.out.println(s);
		}
		System.out.println("***************************Using Iterator******************************");
		Iterator i=ls.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		

	}

}
