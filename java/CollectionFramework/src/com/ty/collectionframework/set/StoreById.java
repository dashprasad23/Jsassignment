package com.ty.collectionframework.set;

import java.util.Comparator;

public class StoreById implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		Integer id1=o1.id;
		Integer id2=o2.id;
		return id1.compareTo(id2);
	}

}
