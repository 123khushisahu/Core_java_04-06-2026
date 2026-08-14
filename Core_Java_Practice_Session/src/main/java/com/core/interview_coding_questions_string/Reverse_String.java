package com.core.interview_coding_questions_string;

public class Reverse_String {

	public static void main(String[] args) {
	String s1="hydd";
	 
//	h y d d
//	0 1 2 3 
	
//	h y d d
//	1 2 3 4
	
	
	StringBuffer object=new StringBuffer(s1);
	object.reverse();
	System.out.println(object);
	
	System.out.println("--------------------------------------------");

	//length 
	  s1.length();
	for(int i=s1.length()-1; i>=0;  i--) {
		
		System.out.print(s1.charAt(i));
	}

	//StringBuffer obj=new StringBuffer();
//	obj.insert(0, "vijay");
//
//	obj.reverse();
//	System.out.print(obj);
	//
	
	//========================================
	System.out.println("======================");
	String s2="khushi";
	StringBuffer object2=new StringBuffer(s2);
	object2.reverse();
	System.out.println(object2);
	
	object2.insert(1, "sahu");
	System.out.println(object2);
 
	object2.reverse();//complete ko reverse kar rahe hai
	System.out.println(object2);
	
	s2.length();
	for(int i=s2.length()-1;i>=0;i--) {
		System.out.println(s2.charAt(i));
		
		
	}
	
	System.out.println("Que.1==============================");
	StringBuilder str=new StringBuilder("khu");
	System.out.println(str);
	str.reverse();
	System.out.println(str);
	
	System.out.println("=========================");
	
	String s3="Kamala Shankar Gupta";
	StringBuilder sbldr=new StringBuilder(s3);
	
	System.out.println(sbldr.reverse());
	
	System.out.println("===============");
	s3.length();
	for(int i=s3.length()-1;i>=0;i--) {
		System.out.print(s3.charAt(i) +"\n");
	}
	
	//=================================
	System.out.println("Question.2");
	StringBuffer sbf=new StringBuffer("jyoti");
	System.out.println(sbf);
	System.out.println(	sbf.reverse());
	
	String s4="Mammi";
	StringBuffer sb=new StringBuffer(s4);
	System.out.println(sb);
	System.out.println(	sb.reverse());
	
	
	s4.length();
	for(int i=s4.length();i>=0;i--) {
		System.out.println(i);
	}
	
	
	
	
	
	//=======================================
	
	StringBuffer sbr=new StringBuffer("ananya");
	System.out.println(sbr.reverse());
	
	String s="jayas";
	StringBuffer sbrr=new StringBuffer(s);
	sbrr.reverse();
	System.out.println(sbrr);
	
	
	s.length();
	System.out.println(s.length());
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
		
	}
}

}
