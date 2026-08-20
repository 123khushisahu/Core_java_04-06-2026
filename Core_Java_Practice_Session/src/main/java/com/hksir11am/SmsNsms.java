package com.hksir11am;

public class SmsNsms {
	
static SmsNsms obj=new SmsNsms();
static {
	System.out.println("SB");
	
}
	{
		System.out.println("NSB");
		
	}
	SmsNsms(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main");
		SmsNsms e2=new SmsNsms();
		System.out.println(e2.x);
		System.out.println(a);
	}
	static int a=10;
	int x=20;
	

}
