package com.core.interview.coding.practice.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_N_position_records {

	public static void main(String[] args) {
	
		
	Integer[]  arr= {10,20,30,50,40,60,100,120,70};
	int k=3;
	
	
	
	//Right rotation: Collections.rotate(list, k) --> POSITIVE SUPPORT(pick element from right and keep
	 //                                                                     it at left)
	
	

            
     List<Integer> list = Arrays.asList(arr);
	
     Collections.rotate(list, k);
     
     System.out.println(list);
     
     
     System.out.println("---------------------------------------");
   //Left rotation: Collections.rotate(list, -k1)  -negative indicate left to right
     int k1=4;
     Integer[]  arr1= {10,20,30,50,40,60,100,120,70};
     List<Integer> list1 = Arrays.asList(arr1);
     Collections.rotate(list1, -k1);
     System.out.println(list1);
     
	
	
	//Rotate an array left by K positions.
     //	k=3 
	System.out.println("=========MyPractice==================");
	Integer[] arr2= {10,20,30,50,4};
	k=2;
	List<Integer> list2 = Arrays.asList(arr2);
	Collections.rotate(list2, -k);
	System.out.println(list2);

	}

}
