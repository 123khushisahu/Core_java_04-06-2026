package com.hksir11am;
//Studentt.java 
public class Studentt extends Person{	
	public Studentt(String name, double height, double weight) {
		super(name, height, weight);
	}

	private static String institute;
	
	private int    sno;
	private String course;
	private double fee;
	
	static {
		institute = "NiT";
		System.out.println("Student class is loaded, \n SFs memory allocated, \n SB is executed and SFs are initialized\n");
		
	}

	private static int studentsCount;
	
	{
		studentsCount++;	
	}
	
	public Studentt() {
		super(null, 0.0, 0.0);
		
		System.out.println("Student class no-param constructor is executed");
		System.out.println(" Student class NSFs are initiaized in " + 
			this.getClass().getName() +"@"+Integer.toHexString(this.hashCode()) +" object\n");
	}

	public Studentt(int sno, String name, String course, double fee, double height, double weight){
		
		super(name, height, weight); //calling super class constructor
									//and storing arguments in super class NSFs 
									//in this current Student object 2020
									
		this.sno	= sno;			//remaining arguments are storing in
		this.course	= course;		//in this Student class NSFs
		this.fee	= fee;			//in this same current Student object 2020
		
		System.out.println("Student class param constructor is executed");
		System.out.println("Student class NSFs are initiaized in " + 
			this.getClass().getName() +"@"+Integer.toHexString(this.hashCode()) +" object\n");
	}

	//setter and getter methods for SFs
	public static void setInstitute(String institute){
		Studentt.institute = institute;	
	}
	
	public static String getInstitute(){
		return institute;	
	}
	
	public static int getStudentsCount(){
		return studentsCount;
	}
	
	//setter and getter methods for NSFs
	public void setSno(int sno){
		this.sno = sno;	
	}
	
	public int getSno(){
		return sno;	
	}
	
	public void setCourse(String course) {
		this.course = course;	
	}
	
	public String getCourse(){
		return course;	
	}
	
	public void setFee(double fee) {
		this.fee = fee;	
	}
	
	public double getFee() {
		return fee;	
	}
	
	//blogic methods
	public void listen() {
		System.out.println(getName() + " is listening "+ course);
	}
	
	public void reply() {
		System.out.println(getName() + " is replying to the "+ course + " questions");		
	}
	
	public void write() {
		System.out.println(getName() + " is writing the "+ course + " notes");				
	}
	
	public void read() {
		System.out.println(getName() + " is reading the "+ course + " notes");				
	}

	//printing objects state
	@Override
	public String toString() {
		return	super.toString() + "\n" +
				("  institute\t: "+ institute)	+ "\n" +
				("  sno\t\t: "   + sno)		+ "\n"+
				("  course\t: "  + course)	+ "\n"+
				("  fee\t\t: "   + fee)		;
	}
}


