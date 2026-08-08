package com.core.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MyAllConceptPrac {
public static void main(String[] args) {
	Integer[] arr= {10,20,30,50,40,60,100,120,70,120};
	Optional<Integer> firsthighest = Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).findFirst();
	System.out.println(firsthighest);
	Optional<Integer> secondhighest = Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	System.out.println(secondhighest);
	
	
	Stream<Integer> limit = Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).limit(2);
	System.out.println(limit);
	
	Optional<Integer> firstsmallest = Arrays.stream(arr).distinct().sorted().findFirst();
	System.out.println(firstsmallest);
	Optional<Integer> secondsmallest = Arrays.stream(arr).distinct().sorted().skip(1).findFirst();
	System.out.println(secondsmallest);
	
	
	List<Integer> asList = Arrays.asList(arr);
	Collections.reverse(asList);
	System.out.println(asList);
	//this is for positive rotate
	int k1=4;
    Integer[]  arr1= {10,20,30,50,40,60,100,120,70};
    List<Integer> list1 = Arrays.asList(arr1);
    //  0/p= 60,100,120,70,10,20,30,50,40
    	System.out.println("07/08/2026 - start");
    Collections.rotate(list1, k1);
    System.out.println(list1);
    System.out.println("07/08/2026 - end"); 
    
   
   
    
    // this is for negative rotate
    int k2=4;
  
    Integer[]  arr2= {10,20,30,50,40,60,100,120,70,11};
   // o/p= 40,60,100,120,70,11,10,20,30,50
    System.out.println("negative start");
    List<Integer> list2 = Arrays.asList(arr2);
    Collections.rotate(list2, -k2);
    System.out.println(list2);
    System.out.println("negative end");
    
}
}
