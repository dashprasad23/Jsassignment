package com.ty.collectionframework.set;

import java.util.Comparator;

public class SortBySal implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		Long l1=o1.salary;
		Long l2=o2.salary;
		return l1.compareTo(l2);
	}
	

}
