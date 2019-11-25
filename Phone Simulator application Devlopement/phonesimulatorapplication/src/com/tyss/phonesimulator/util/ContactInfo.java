package com.tyss.phonesimulator.util;

import com.tyss.phonesimulator.dao.ContactDaoImpl;
import com.tyss.phonesimulator.dao.ContactDaoImpl2;
import com.tyss.phonesimulator.dao.ContactDaoImpl3;

public class ContactInfo {
	private ContactInfo()
	{}
	public static ContactDaoImpl getContact1Obj()
	{
		return new ContactDaoImpl();
	}
	public static ContactDaoImpl2 getContact2Obj()
	{
		return new ContactDaoImpl2();
	}
	public static ContactDaoImpl3 getContact2Obj3()
	{
		return new ContactDaoImpl3();
	}

}
