package com.hksir11am;

public class Example {




	int x = 10;
	int y = 20;

	public static void main(String[] args){
		
		//System.out.println(null.x);  //CE: <null> can not be dereferenced
		
		m1(null); //no error, output: null		
													System.out.println();
		//m2(null); //CE: ambiguous error

		String s2 = null;			
		m2(s2);		
		m2((String)null);
													System.out.println();
		Example e3 = null;		
		m2(e3);		
		m2((Example)null);
		
/**/
	}//main method close

	static void m1(String s){
		System.out.println("m1(String): "+ s);
	}

	static void m2(String s){
			System.out.println("String param method: "+ s);
	}
	static void m2(Example e){
			System.out.println("Example param method: "+ e);
	}
}


