package com.ty.collectionframework.list;

public class TestL {

	public static void main(String[] args) {
		
		StudentData[] arr=new StudentData[5];
		
		StudentData s1=new StudentData(1223,"saraha",63.44);
		StudentData s2=new StudentData(1224,"laura",69.09);
		StudentData s3=new StudentData(1225,"Cortena",78.00);
		StudentData s4=new StudentData(1226,"Siri",86.03);
		StudentData s5=new StudentData(1227,"Steve",93.88);
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		arr[3]=s4;
		arr[4]=s5;
		System.out.println("====================For Loop================================");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("==========================Foreach Loop======================");
		
		for(StudentData e:arr)
		{
			System.out.println(e);
		}
		
		
		

	}

}
