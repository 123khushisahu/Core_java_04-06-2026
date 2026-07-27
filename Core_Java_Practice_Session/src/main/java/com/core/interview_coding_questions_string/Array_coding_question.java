package com.core.interview_coding_questions_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Array_coding_question {

	public static void main(String[] args) {
		
		
		/*
		Basic Array Questions
		
		Reverse an array.
		Find the largest element in an array.
		Find the smallest element in an array.
		Find the second largest element.
		Find the second smallest element.
		Find the maximum and minimum in a single traversal.
		Count even and odd numbers.
		Find the sum of all elements.
		Find the average of array elements.
		Search an element (Linear Search).
		
		*/
		
		//second highest number find it using java 8 
		Integer[]  num= {10,20,30,52,60,80,52,100,456,200};
		
		
		List<Integer> list=Arrays.asList(num);
		
	 List<Integer> result=    list.stream().distinct().sorted(Comparator.reverseOrder()).
			 limit(3).collect(Collectors.toList());
	 
	 System.out.println(result);
	 
	 
		//Arrays no=Arrays.stream(num).sorted().filter().;
		//System.out.println(no);
		
		Integer[]  num2= {10,20,30,52,60,80,561565,100,456,200};
		
		
		List<Integer> list2=Arrays.asList(num2);
		
		Collections.reverse(list2);
		
		System.out.println("==========================================================="  + list2);
		
		
		List<Integer> list3 = list2.stream().sorted().toList();
		System.out.println(list3);
		
		
		
		
		
		
		
		

		

	}

}
