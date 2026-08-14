package com.core.interview.coding.practice.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_two_array {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {2, 4, 6, 8};

		//int[] result = new int[arr1.length + arr2.length];
          int[] result=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
		
		
		System.out.println(Arrays.toString(result));
		
		//merge two array without 3 and 6 element
		
        int[] result1=IntStream.concat(Arrays.stream(arr1).filter(x->x !=3), Arrays.stream(arr2)).filter(x->x !=6).toArray();
		System.out.println(Arrays.toString(result1));

		
		System.out.println("=========Find the inter section of two arrays. =====================");
		//Find the inter section of two arrays.
		int[] arrr1= {1,2,22,33};
		int[] arrr2= {1,2,226,313};
		Arrays.stream(arrr1).filter(x->Arrays.stream(arrr2).anyMatch(y->y==x)).
        forEach(System.out::println);
		
		System.out.println("-----------------------Find the union of two arrays.--------------------");
		
		//Find the union of two arrays.in
		int[] arrr3= {1,2,5};
		int[] arrr4= {17,28,5};
int[] array = IntStream.concat(Arrays.stream(arrr3), Arrays.stream(arrr4)).toArray();	
	System.out.println(Arrays.toString(array));	
	}

}
