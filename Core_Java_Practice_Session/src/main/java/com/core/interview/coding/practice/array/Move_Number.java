package com.core.interview.coding.practice.array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Move_Number {
	
	public static void main(String[] args) {
		
		//Question -1.   MOVE ALL ZERO IN LAST  {0, 1, 0, 3, 12}
		
		int[] arr = {0, 1, 0, 3, 12};
//
//		int[] result = IntStream.concat(
//		        Arrays.stream(arr).filter(x -> x != 0),
//		        Arrays.stream(arr).filter(x -> x == 0)
//		).toArray();
//
//		System.out.println(Arrays.toString(result));
		
		int[] array = IntStream.concat(
				Arrays.stream(arr).filter(x->x==0),
				Arrays.stream(arr).filter(x->x!=0)
				).toArray();
		System.out.println(Arrays.toString(array));
				
		System.out.println("--------------------------------------------------------------");
		
		//Question -2.   MOVE ALL 3 FIRST THEN ZERO AND REMAINING IN LAST  {0,1,0,3,3,4,2,3,8,6,3,6,9,6,12}
		int[] arr1= {0,1,0,3,3,4,2,3,8,6,3,6,9,6,12};
		//IntStream.concat(null, null)
		
		int[] arr2=IntStream.concat(
				       IntStream.concat(
						Arrays.stream(arr1).filter(x->x==3),
						Arrays.stream(arr1).filter(x->x==0)
						),
				 Arrays.stream(arr1).filter(x->x!=0 && x!=3)
				).toArray();
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		//Question -3.   MOVE ALL NEGATIVE NUMBER IN ONE SIDE {0,1,0,-3,3,-4,2,3,-8,6,3,-6,-9,6,-12}
				int[] arr3= {0,1,0,-3,3,-4,2,3,-8,6,3,-6,-9,6,-12};
				
				int[] array2 = IntStream.concat(
						Arrays.stream(arr3).filter(x->x >0),
						Arrays.stream(arr3).filter(x->x < 0)
						).toArray();
				System.out.println(Arrays.toString(array2));
				

		
		
	}

}
