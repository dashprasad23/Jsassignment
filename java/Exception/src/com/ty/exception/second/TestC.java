package com.ty.exception.second;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class TestC {

	public static void main(String[] args) {

		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter age");
			int age=sc.nextInt();
			System.out.println(age/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block executed");
		}
		System.out.println("====================================");
		
		


	}

}
