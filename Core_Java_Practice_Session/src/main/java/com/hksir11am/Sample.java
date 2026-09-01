package com.hksir11am;

public class Sample {

	
		public static void main(String[] args) {
			//System.out.println(5, 6);
			
			System.out.println(10);		
			System.out.println(10.5);		
			System.out.println('a');		
			System.out.println(true);		

			//System.out.println(null);		//CE: ambiguous error
			
			String s = null;				//here null is of type String
			System.out.println(s);			//no CE, no RE, 
			System.out.println((String)null);//no CE, no RE, 
												//println(String) param method is executed 
												//O/P: null is displayed

			//System.out.println((char[])null);	//no CE, RE: NPE

			Example e = null;
			int[] ia = null;

			System.out.println(e);	//println(Example)	-> println(Object) -> null
			System.out.println(ia);	//println(int[])	-> println(Object) -> null
	/**/	
		}

	}


