package com.core_java.Oop;

public class Pig  implements Animal1{				

	@Override
	public void animalSound() {
		
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("this is the multiplication of c : " +c);
		
		
		System.out.println("animalSound methods");
		
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep methods");
		
		
	}

	@Override
	public void animalSoundWithParameter(int i, int j) {
		
		int c=i*j;
		System.out.println(c);
		
		
	}



	
	
	

}
