package com.core_java.Oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EA {
	public static void main(String[] args) {
		Integer[] arr= {10,20,30,2,90,1,7};
//		System.out.println(arr[2]);
//		for(int i=0;i>=2000;i++) {
//			System.out.println(i.toString);
//		}
//	}
		
		List<Integer> list =Arrays.asList(arr);
		
		
		Collections.sort(list);
		
	//largest elememt
   Object object = list.stream().sorted(Collections.reverseOrder()).findFirst().get();
   System.out.println(object);
   
   //smallest element
   Object object1 = list.stream().sorted().findFirst().get();
   
   System.out.println(object1);
   
   
   //Find the second largest element.
   Object object2 = list.stream().sorted(Collections.reverseOrder()).skip(2).findFirst().get();
   
   System.out.println(object2);
		
		
  for(int i=arr.length-1;i>=0;i--) {
	  if(arr[i]%2==0 ) {
		  System.out.println("even"+arr[i]);
		  
  }else {
	  System.out.println("odd" +arr[i]);
  		
		
		
	}
  }
  // java 8
  System.out.println("------------------------------------------");
 list.stream().map(x->x%2 ==0 ? "even" : "odd").forEach(System.out::println);
 
  
 
 
  
  
	
	}
}
	
	


