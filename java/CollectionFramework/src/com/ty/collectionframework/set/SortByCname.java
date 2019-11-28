package com.ty.collectionframework.set;

import java.util.Comparator;

public class SortByCname implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		String st1=o1.cName;
		String st2=o2.cName;
		return st1.compareTo(st2);
	}

}
