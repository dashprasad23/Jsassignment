package com.ty.collectionframework.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		
	 Integer i=o1.accountno;
	 Integer j=o1.accountno;
	 return i.compareTo(j);
		
	}

}
