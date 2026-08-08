package com.core.interview.coding.practice.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindTheLargestNumber {

	public static void main(String[] args) {
		
		//first way using array
		//find the largest number without repeating number
		Integer[] arr= {10,20,30,50,60,80,100,200,2,1000,200,300,100};
		
      Optional<Integer> first = Arrays.stream(arr).distinct()
		.sorted(Comparator.reverseOrder()).findFirst();
      
      System.out.println(first);
      
    //find the Second largest number without repeating number
      Optional<Integer> first2 = Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();//skip
      //not follow index follow only lenght(1----------------n)
		System.out.println(first2);
		
    //second way using list
     Integer[] arr1= {10,20,30,50,60,80,100,200,2,1000,200,300,100};
       List<Integer>  list1=  Arrays.asList(arr1);
       
    
       
 Integer result= list1.stream().distinct()
		 .sorted(Comparator.reverseOrder())
		 .findFirst().get();
 
System.out.println(result);

        
       System.out.println("=================MyPractice====================");
       //1 highest
       Integer[] arr2= {1,2,3,4,5,4,33,222,212};
       Optional<Integer> first3 = Arrays.stream(arr2).distinct().sorted(Comparator.reverseOrder()).findFirst();
      System.out.println(first3);
      //2 highest
      List<Integer> asList = Arrays.asList(1,2,33,444,555,23);
      Integer integer = asList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(integer);	

	}

}
