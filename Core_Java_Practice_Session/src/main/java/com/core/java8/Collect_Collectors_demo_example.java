package com.core.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect_Collectors_demo_example {

	public static void main(String[] args) {
		/*
		collect() is a terminal operation in the Java Stream API.

		It is used to collect the elements of a Stream into another form, such as a List, Set, or Map.

		Syntax
		stream.collect(Collectors.toList());
		
		
		General Format
		stream.collect(Collector)

		Here:

		stream → Source of data
		collect() → Collects the data
		Collector → Tells how to collect the data
		
		
		
		
⭐ Most Important for Java 8 Interviews
✅ toList() -done
✅ toSet() -done
✅ toMap() -done
✅ joining() -done
✅ counting() -done
✅ groupingBy() -done

✅ partitioningBy()
✅ mapping()
✅ summingInt()
✅ averagingInt()
✅ summarizingInt()
✅ maxBy()
✅ minBy()
✅ reducing()
✅ collectingAndThen()
		
           */
		
		Integer[] arraysobj= {400,200,400,300,600,900,300,800,8000,900,400,300,8000,800};
		
	   List<Integer> results=	Arrays.stream(arraysobj).collect(Collectors.toList());
	  System.out.println(results);
	
	
	
	
	
	
		
		System.out.println("---------------------------------------------------------------------");
		
		Map<Integer,Long> collect = Arrays.stream(arraysobj).collect(Collectors.groupingBy(obj->obj,Collectors.counting()));
		
		System.out.println(collect);
		
		//toSet()
		List<String> str=Arrays.asList("Vijay","ajay","Vijay","kamal","ajay");
		     
	Set<String>	 setvar= str.stream().collect(Collectors.toSet());
	
	System.out.println(setvar);
	
	
	//toMap
	
	//Collectors.toMap() का उपयोग Stream के elements को Map (Key-Value Pair) में collect करने के लिए किया जाता है।

	//Syntax
	//Collectors.toMap(keyMapper, valueMapper)
	
	 String[]  str1  = {"VIJAY","MUMBAI","MANTRALAYA","VIJAY","KALYAN"};
	 
	 
	     Map<String, Integer> collect2 = Arrays.stream(str1)
	    		 .collect(Collectors. toMap(obj-> obj ,obj ->obj.length(),(oldValue, newValue)->newValue));
	    		
	     
	     System.out.println(collect2);
	     
	     
	     //joining()
	     String str2="My india is great";
	     
	     List<String> str3=Arrays.asList(str2.split(" "));
	     Collections.reverse(str3);
	     
	     System.out.println(str3);
	     
	String result=  str3.stream().collect(Collectors.joining(" "));
	
	System.out.println(result);
	     
	     
	     
	     
	     
	     
	     
	     
	 
	 
	 
	 
	 
	
		
		
		
	
		
		
		
		
		
	}

}
