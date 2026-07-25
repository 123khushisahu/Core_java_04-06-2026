package com.core.java8;

import java.sql.Connection;
import java.sql.DriverManager;

public   class MysqlDBconn implements Demo_Inteface {

	

	@Override
	public void DBConnection() {
		
		
		try {

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database URL
            String url = "jdbc:mysql://localhost:3306/studentdb";

            // Username & Password
            String username = "root";
            String password = "root";

            // Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("MySQL Database Connected Successfully...");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		MysqlDBconn mydb=new MysqlDBconn();
		mydb.DBConnection();
		
		
		
		
	}





	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
