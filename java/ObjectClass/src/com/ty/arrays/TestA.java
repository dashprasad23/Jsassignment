package com.ty.arrays;

public class TestA {

	public static void main(String[] args) {

		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		for(int i=0;i<nums.length;i++)
		{

			System.out.println(nums[i]);


		}
		System.out.println("====================================");
		for(int num:nums)
		{
			System.out.println(num);
		}
		System.out.println("====================================");
		char[] ch= {'a','b','c','d'};
		for(int c:ch)
		{
			System.out.println(c);
		}
		System.out.println("==================================");
		boolean[] b= {true,false,true,false};
		for(boolean b1:b)
		{
			System.out.println(b1);
		}
		System.out.println("=============================");
		byte[] by= {1,2,3,4,5};
		for(byte b2:by)
		{
			System.out.println(b2);
		}
		System.out.println("---------------------");
		for(int i=0;i<by.length;i++)
		{
			System.out.println(by[i]);
		}
		System.out.println("=====================================");
		double[] d= {12.34,34,54,65.90,76,21};
		for(double e:d)
		{
			System.out.println(e);
		}
		System.out.println("--------------------------");
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		System.out.println("================================");
		String[] st= {"Zebra","Giraf","lion","Tiger"};
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println("-------------------------");
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println("+++++++++++++++++++++++++++");
		
		
		
		

	}

}
