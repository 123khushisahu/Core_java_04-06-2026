package Exception_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.net.aso.q;

public class Compile_time_exception_or_checked_exception {

	public static void main(String[] args)  {
		
		
	//	Q.1 Compile_time_exception_or_checked_exception
		
		// During the code writting if we are getting exception that is 
		 
		// Compile time exception or checked_exception 
		 
		// like:  syntax error ,IO exception ,File not found exception 
		
	/*	Checked exceptions are exceptions that are checked by the compiler 
		at compile time and must be handled using try-catch 
		or declared using throws.
		
		
		
		Examples of Checked Exceptions:
            
            FileNotFoundException
			IOException
			SQLException
			ClassNotFoundException
			InterruptedException
			*/
		
		
		//1.FileNotFoundException
		try {
			FileReader fr=new FileReader("D:\\GIT_GITHUB_Notes.pdf");
			FileReader fr1=new FileReader("C:\\Users\\admin\\Desktop\\Employee_ Registration_form\\employee_REgistration query.txt");
			System.out.println("found path");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("not found path");
		}
		
		
		//2.IOException
		
		try {
			FileWriter  fw=new FileWriter("D:\\vijay.txt");
			
			fw.write("vijay You are good man..... and he is staying in mumbai now");
			fw.close();
			//fw.write(221303);
			
			FileWriter fw1=new FileWriter("D:\\pra.txt");
			fw1.write("WELCOME TO DUBAI .......");
			fw1.write("my pin code number "+221303);
			
			fw1.close();
			
			
			
			
			
			

			 System.out.println("Data Written Successfully");

			
		}
	catch (Exception e) {
		
		e.printStackTrace();
	}
		
		
		//Q. 3 SQLException
		
	      try {
	    	  Connection con = DriverManager.getConnection(
	                  "jdbc:oracle:thin:@localhost:1521:orcl",
	                  "mydb11am",
	                  "123");

	          System.out.println("Connected");  
	      }
	      catch (SQLException se) {
	    	  se.printStackTrace();
			
		}
		 
		
		
	      
		
		
		
		 

	}//CLOSE MAIN METHODS 

} //CLOSE CLASS






