package com.hksir11am;

import java.util.Arrays;

public class ToStringMethod01 {
	public static void main(String[] args) {
		
System.out.println("======int[] example=======");	

int[] arr= {1,3,4,5,6};

System.out.println(arr);
System.out.println(arr.toString());
System.out.println(Arrays.toString(arr));


System.out.println("char[] example...");

char[] arr1= {'a','b','c','d'};
System.out.println(arr1);
System.out.println(arr1.toString());
System.out.println(Arrays.toString(arr1));


}
}
