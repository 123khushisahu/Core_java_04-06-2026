package com.core.interview.coding.practice.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find duplicate elements.

public class RepeatedArray {
public static void main(String[] args) {
	
	//second way to do
	Integer[] arr= {1,2,3,3,2,4,4,5 ,5,5,5};
	Map<Integer, Long> collect = Arrays.stream(arr).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	System.out.println(collect);
	
	for (Map.Entry<Integer, Long> mapvariable :collect.entrySet()) {
		
		//System.out.println(mapvariable);
		if(mapvariable.getValue()>1) {
			System.out.println(mapvariable.getKey());
		}
		
		
		
	}
	
	//Remove duplicate elements.
Integer[] arr1= {1,1,1,22,33,45,65,44,45,65};
List<Integer> collect2 = Arrays.stream(arr1).distinct().collect(Collectors.toList());
System.out.println(collect2);

            List<Integer> listkhushi=Arrays.asList(1,1,1,22,33,45,65,44,45,65);
         //  List<Integer> listkhushi = List.of(1,1,1,22,33,45,65,44,45,65);
           List<Integer> collect3 = listkhushi.stream().distinct().collect(Collectors.toList());
           System.out.println("this is for clearance data: " +collect3);
	
}
}
