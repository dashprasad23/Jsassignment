package com.ty.filehandling;


import java.io.FileReader;

import java.io.IOException;

public class FileReadingClass {

	public static void main(String[] args) {
		
		String path="C:\\Users\\DEBI\\Desktop\\text.txt";
		FileReader reader=null;
		try {
			 reader=new FileReader(path);
			int i;
			while((i=reader.read())!=-1)
			{
				System.out.print((char)i);
				
			}
			
			System.out.println();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				reader.close();
			} 
			catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
