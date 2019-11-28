package com.ty.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(20);
		ar.add(23);
		ar.add(5);
		ar.add(12);
		ar.add(4);
		ar.add(24);
		List<Integer> l1=ar.stream().map(i->i+50).collect(Collectors.toList());
		for(Integer i:l1)
		{
			System.out.println(i);
		}

	}

}
