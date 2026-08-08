package com.core.interview.coding.practice.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindTheSmallestNumber {

	public static void main(String[] args) {
		
		//vijay  
		//ctrl+shift+x==capital letter  
		//ctrl+shift+y==small letter
		
	//find the smallest number in list
		//o/p=1000
		List<Integer>  list=Arrays.asList(1000,3000,8000,5000,80000,6000,2000);
		
		Integer integer = list.stream().distinct().sorted().findFirst().get();
		
		System.out.println(integer);
	
       Integer integer1=list.stream().distinct().sorted().skip(1).findFirst().get();
       System.out.println(integer1);
      
       Integer integer2 = list.stream().distinct().sorted().skip(4).findFirst().get();
      
		System.out.println(integer2);
		
		
		
		//FOR REVERSE LIST
		List<Integer>  list3=Arrays.asList(1000,3000,8000,5000,80000,6000,2000);
		
		System.out.println(list3);
		System.out.println("--------------------------------------------");
		
		Collections.reverse(list3);
		System.out.println(list3);
		
		System.out.println("===========MyPractice=================");
		//first largest
		Integer[] arr= {1000,3000,8000,50000,800,6000,200};
		Optional<Integer> first = Arrays.stream(arr).distinct().sorted().findFirst();
		System.out.println(first);
		
		//second largest
		List<Integer> asList = Arrays.asList(1,2,34,5,6,77,77,764,344);
		Integer integer3 = asList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
System.out.println(integer3);
	}

}
