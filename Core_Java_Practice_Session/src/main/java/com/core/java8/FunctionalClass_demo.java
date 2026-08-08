package com.core.java8;

import java.sql.Connection;
import java.sql.DriverManager;

public class FunctionalClass_demo implements Demo_Inteface  {

	@Override
	public void addition(int a, int b) {
		
		System.out.println(a+b);
	}
	
	
	public void DBConnection() {
		
		 try {

	            // Load Oracle Driver
	            Class.forName("oracle.jdbc.OracleDriver");

	            // Database URL
	            String url = "jdbc:oracle:thin:@localhost:1521:orcl";

	            // Username & Password
	            String username = "mydb11am";
	            String password = "123";

	            // Create Connection
	            Connection con = DriverManager.getConnection(url, username, password);

	            System.out.println("Database Connected Successfully...");

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		FunctionalClass_demo obj=new FunctionalClass_demo();
		
		obj.addition(10, 30);
		
		//for oracle db connection
		obj.DBConnection();
		
		
		
		
		
	}


	
	
	
	

	

}
