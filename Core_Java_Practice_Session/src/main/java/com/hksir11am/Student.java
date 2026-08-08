package com.hksir11am;

public class Student {


/*
  Develop a program  
	1. for initializing static and non-static variables via setter method and 
	2. read and print those values by using getter and display method
*/
//Student.java

	
	private static String institute;
	private static String instituteAddress;
	
	private int sno;
	private String sname;
	
    public static void setInstitute(String institute) {
			Student.institute = institute; 
	}
	
	public static String getInstitute() {
		return institute;	
	}
	
	public static void setInstituteAddress(String instituteAddress) {
		Student.instituteAddress = instituteAddress;	
	}
	
	public static String getInstituteAddress() {
		return instituteAddress;
	}
	
	public void setSno(int sno) {
		this.sno = sno;	
	}
	
	public int getSno() {
		return sno;
	}
	
	public void setSname(String sname)	{
		this.sname = sname;	
	}
	
	public String getSname() {
		return sname;	
	}
	
	public void display() {
		System.out.println(" institute Name\t\t: "	+ institute);	
		System.out.println(" institute Address\t: "	+ instituteAddress);	
		System.out.println(" student no\t\t: "		+ sno);	
		System.out.println(" student name\t\t: "	+ sname);	
	}

}
 