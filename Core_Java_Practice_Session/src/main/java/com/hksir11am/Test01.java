package com.hksir11am;




class A002 {
//hidden members by sub class members	
static int a = 10;
int x = 20;

}

class B extends A002 {

//variable hiding
  static int a = 30;
  int x = 40;

void m1(){
  System.out.println(a);	//30 
  System.out.println(x);	//40

  System.out.println(super.a);	//10 
  System.out.println(super.x);	//20
}

void m2() {
  //variable shadowing
	int a = 50;
	int x = 60;

	System.out.println(a);	//50 
	System.out.println(x);	//60

	System.out.println(this.a);	//30 
	System.out.println(this.x);	//40

	System.out.println(super.a);	//10 
	System.out.println(super.x);	//20

}

static void m3(){
	System.out.println(a);
	//System.out.println(x);

	//System.out.println(this.a);
	//System.out.println(this.x);

	//System.out.println(super.a);
	//System.out.println(super.x);

	System.out.println(A.a);

	A002 b1 = new B();	//access B class members from B object 1010
	A002 a1 = b1;	//access A class members from B object 1010

	System.out.println(b1.x); //60
	System.out.println(a1.x); //20
	

}
}
 public class Test01 {
public static void main(String[] args) {
	B b1 = new B();

	System.out.println(b1.a);
	System.out.println(b1.x);

	//System.out.println(super.a);
	//System.out.println(super.x);

	A002 a1 = b1;
	System.out.println(a1.a);
	System.out.println(a1.x);
}
}