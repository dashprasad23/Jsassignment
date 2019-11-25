package com.tyss.phonesimulator.app;

import java.util.List;
import java.util.Scanner;

import com.tyss.phonesimulator.dao.ContactDaoImpl;
import com.tyss.phonesimulator.dao.ContactDaoImpl2;
import com.tyss.phonesimulator.dao.ContactDaoImpl3;
import com.tyss.phonesimulator.dto.ContactBean;
import com.tyss.phonesimulator.util.ContactInfo;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search for contact");
		System.out.println("press 3 to operate on contact");
		int a=s.nextInt();
		if(a==1)
		{
			ContactDaoImpl c1=ContactInfo.getContact1Obj();
			List<ContactBean> li=c1.display();
			for(ContactBean i:li)
			{
				System.out.println("Contact name is: "+i.getName());
				System.out.println("Contact number is: "+i.getNumber());
				System.out.println("Contact Group is: "+i.getGroup());
				System.out.println("_______________________________________________");
			}
		}
		if(a==2)
		{
			System.out.println("press 1 to call");
			System.out.println("Press 2 to message");
			System.out.println("Press 3 to get back to main manu");
			ContactDaoImpl2 c2=ContactInfo.getContact2Obj();
			int b=s.nextInt();
			
			if(b==1)
			{
				String st=c2.call();
				System.out.println(st);
				
			}
			if(b==2)
			{
				c2.message();
			}
			if(b==3)
			{
				c2.mainManu();
			}
			
			
		}
		if(a==3)
		{
			ContactDaoImpl3 c3=ContactInfo.getContact2Obj3();
			System.out.println("Enter 1 to add new Contacts");
			System.out.println("Enter 2 to delete the contact");
			System.out.println("Enter 3 to edit the contact");
			int c=s.nextInt();
			if(c==1)
			{
			 int r= c3.add();
			 System.out.println(r+" rows updated");
			}
			if(c==2)
			{
				int r=c3.delete();
				System.out.println(r+" row Deleted");
			}
			if(c==3)
			{
				int r=c3.edit();
				System.out.println(r+" row Updated");
			}
			
		}

	}

}
