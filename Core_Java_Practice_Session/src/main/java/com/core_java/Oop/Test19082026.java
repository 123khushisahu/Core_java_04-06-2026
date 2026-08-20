package com.core_java.Oop;

import java.io.FileReader;
import java.io.IOException;

public class Test19082026 {
	
	public static void main(String[] args) throws Exception {
		
		FileReader reader=new FileReader("d/vijay.txt");
		
		int i = reader.read();
		System.out.println(i);
		throw new Exception("file not found error for my side...");
		
		
		
	}

}
