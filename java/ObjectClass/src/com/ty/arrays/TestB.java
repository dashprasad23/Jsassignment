package com.ty.arrays;

public class TestB {

	public static void main(String[] args) {
		int[] num= {10,20,30,40};
		receive(num);
		int[] values=getArray();
		System.out.println("================");
		for(int i:values)
		{
			System.out.println(i);
		}
		System.out.println("===============");
		String[] valuess=getarray1();
		for(String s:valuess)
		{
			System.out.println(s);
		}

	}
	static void receive(int[] numbers)
	{
		for(int num:numbers)
		{
			System.out.println(num);
		}
	}
	static int[] getArray()
	{
		int[] values= {20,30,40,50};
		return values;
	}
	static String[] getarray1()
	{
		String[] values= {"tiger","leopard","deer"};
		return values;
	}

}
