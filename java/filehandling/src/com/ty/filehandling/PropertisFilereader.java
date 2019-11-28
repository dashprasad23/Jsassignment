package com.ty.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertisFilereader {

	public static void main(String[] args) {
		String path="text.properties";
		FileReader reader=null;
		try
		{
			reader=new FileReader(path);
			Properties properties=new Properties();
			properties.load(reader);
			String url=properties.getProperty("url");
			String user=properties.getProperty("user");
			String password=properties.getProperty("password");
			System.out.println("URL:"+url);
			System.out.println("USER:"+user);
			System.out.println("PASSWORD:"+password);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
