package com.core_java.Oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class Test_interface_class  implements TestInteface {
	
	
	@Override
	public void getedata() {
		System.out.println("THIS IS THE IMPLEMENTED METHODS ");
		
	}
	
	
	
	
	@Override
	public void savedata() {
		
		
		
	}
	
	@Override
	public void databaseConnectionMethods() throws ClassNotFoundException {
		
		try {
			 // Step 1: Load Oracle Driver
	        Class.forName("oracle.jdbc.OracleDriver");

	        // Step 2: Create Connection
	        Connection con = DriverManager.getConnection(
	                "jdbc:oracle:thin:@localhost:1521:orcl",
	                "mydb11am",
	                "123");

	        System.out.println("Oracle Database Connected Successfully");

	        // Step 3: Close Connection
	        con.close();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		

		
		
	}
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Test_interface_class ti=new Test_interface_class();
		ti.databaseConnectionMethods();
		
		ti.getedata();
		int a=10;
		
		
		
		
		
		

	}




	




	

	






	

	

	

}
