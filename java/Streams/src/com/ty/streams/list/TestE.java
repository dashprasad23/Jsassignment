package com.ty.streams.list;

import java.util.ArrayList;
import java.util.Comparator;


public class TestE {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks =new ArrayList<Integer>();
		marks.add(70);
		marks.add(25);
		marks.add(35);
		marks.add(30);
		marks.add(90);
		marks.add(45);
		Comparator<Integer> cmp=(m1,m2)->{
			if(m1>m2)
			{
				return 1;
			}
			else if(m1<m2)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
		long nf=marks.stream().filter(i->i<35).count();
		System.out.println("number of students failed in Exam "+nf);
		System.out.println("===================================");
		int m= marks.stream().min(cmp).get();
		System.out.println("Min value "+m);
		System.out.println("====================================");
		int m1= marks.stream().max(cmp).get();
		System.out.println("Maximum value is "+m1);
		System.out.println("====================================");
	}

}
