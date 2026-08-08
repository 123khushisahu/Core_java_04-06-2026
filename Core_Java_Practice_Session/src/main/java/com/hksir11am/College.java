package com.hksir11am;

//College.java
class College {
	public static void main(String[] args) {
		
	 //Loading Student class and initializing static fields		
		Student.setInstitute("NiT");
		Student.setInstituteAddress("Hyderabad");
		
		System.out.println("Student class is loaded");		
		System.out.println("  memory is allocated to static fields");		
		System.out.println("  static variables are initialized with given values\n");		
		
	 //creating 2 instances from class Student	
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println("2 instances are created from class Student");		
		System.out.println("  2 separate memory copies are allocated to non-static fields");		
		System.out.println("  non-static variables are initialized with default values");		
		
     //printing s1 and s2 instances values		
		System.out.println("\ns1 instance values");
		s1.display();  //NiT Hyd 0 null
		
		System.out.println("\ns2 instance values");
		s2.display();  //NiT Hyd 0 null
		
	  //initializing NS fields in s1 instance with HK values
	    s1.setSno(101);
		s1.setSname("HK");
		System.out.println("\ns1 instance is initialized with HK values");
		
	  //initializing NS fields in s2 instance with BK values
	    s2.setSno(102);
		s2.setSname("BK");
		System.out.println("s2 instance is initialized with BK values");
		
	  //Printing s1 and s2 instnaces values after initialization	
		System.out.println("\ns1 instance values after initialization");	
		s1.display();  //NiT  Hyd  101 HK
		
		System.out.println("\ns2 instance values after initialization");	
		s2.display();  //NiT  Hyd  102 BK
		
		//printing object values by using getter methods
		System.out.println(s1.getInstitute());
		System.out.println(s1.getInstituteAddress());
		System.out.println(s1.getSno());
		System.out.println(s1.getSname());
		System.out.println();

		System.out.println(s2.getInstitute());
		System.out.println(s2.getInstituteAddress());
		System.out.println(s2.getSno());
		System.out.println(s2.getSname());
	
		
		
	}

}

/*
- Save above 2 java files in a single folder
- Compile and executed College.java file
	>javac College.java
	     |-> College.class
	     |-> Student.class
		 
	>java College
	
	
Test Case: 
	In Student class inside setter methods
      remove 'Student.' and 'this.' in accessing SV and NSV
	compile and run College.java and find output
			
		- there is not CE or RE
		- the problem is the arguments are not stored in SV and NSV
		  when we print we will get default values

Q) What is the right design to achieve code reusablitliy in accessing fields?		
A) Allow user to access fields only via setter, getter, and display methods
	
   In the class Student we defined setter methods, getter methods and display method 
   for developing reusable logic for setting, getting and printing object values
   common to all objects, then for achieving code reusability
	1. we 'must allow' user programmer to access Student class
       static and non-static fields only via setter, getter and display method, 
	2. we 'must not allow' user programmer to access 
	   static and non-static fields directly by their name.
	   
Q) Then what must we do in class Student for stopping user to access
   static and non-static fileds directly by their name?
A) declare all static and non-static fields as private
   so that user programmer forced to access all fileds only via methods
   then automatically we achieve 
	1. code reusability
	2. centralized code change
	
*/
