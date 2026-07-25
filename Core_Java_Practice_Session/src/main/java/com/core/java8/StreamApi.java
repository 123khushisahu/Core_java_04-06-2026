package com.core.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import oracle.net.aso.q;

public class StreamApi {
	
	public static void main(String[] args) {
	/*
	 * Java 8 Stream API
	 * 
The Stream API introduced in Java 8 is used to process collections
 of data in a functional and declarative way. It allows operations like
  filtering, sorting, mapping, and reducing data without modifying the original collection.

Key Features
Processes data from collections, arrays, or I/O channels.
Supports functional programming using lambda expressions.
Can perform operations sequentially or in parallel.
Does not store data; it operates on the source.

Stream Operations

There are two types of operations:

1. Intermediate Operations
mid me write up hoga
These return another stream and are lazy.

filter()- done
map() - done
sorted()-done
distinct()
limit()
skip()

2. Terminal Operations

These produce a result or a side effect.

forEach() - done
collect()-done
count()
reduce()
findFirst()
anyMatch()
allMatch()
noneMatch()
	
*/
	
	//1. filter()
	
	//Definition (English)

	//filter() is an intermediate operation of the Stream API that is used to select only those elements that satisfy 
		//a given condition (predicate).

	//Syntax :
	
	//stream.filter(condition)
		System.out.println("=======================");
	int[] arr= {1,2,3,4,5};
	Arrays.stream(arr).filter(ram->ram%2==0).forEach(System.out::println);

	System.out.println("================================");
		List<Integer> listobj=Arrays.asList(1,2,3,4,5,20,56,59,33,77,99);
	
		
	//-> Requirement is print only even number from list
	
	//with method reference
    listobj.stream().filter(khushi -> khushi % 2==0 ).forEach(System.out::println);
    
    //without method reference
    listobj.stream().filter(khushi -> khushi % 2==0 ).forEach(num -> System.out.println(num));

//System.out.println(var);
    
    
      // map()
   // Definition (English)

  //  The map() method is an intermediate operation in the Stream API. It is used to transform (convert) each element of a stream into another form.

  //  👉 One input element produces one output element.
   
    
    //syntax: 
   // stream.map(element -> transformation)
    
    
    
    //make uppar case
    List<String>  strobj=Arrays.asList("vijay" ,"ajay","khushi","jyoti");
    
   
    //with method ref
    strobj.stream().filter(str->str.equals("vijay"))
    .map(str1-> str1.toUpperCase())
    .forEach(System.out::println);
    
    
    //without method ref
    strobj.stream().filter(str->str.equals("vijay")).forEach(num->System.out.println(num));
    
    
  //stream.filter(condition)
//  Q.1.   
  Integer[] var= {10,20,30,40,50,60,70,80};
    
  //  o/p= 20,50,80 using java 8 
    Arrays.stream(var).filter(x-> x==20 || x==50 || x==80).forEach(System.out::println);
    
    System.out.println("=======================");

   //Q.2
    List<Integer> listvar=  Arrays.asList(10,20,33,40,50,60,77,99);  
    
  //  print even number
  listvar.stream().filter(y->y%2==0).forEach(System.out::println);
  
  System.out.println("=======================");

  listvar.stream().filter(y->y%2!=0).forEach(System.out::println);
  
  
  
 // map String Coding Question
  
  String[] str= {"vijay ","Kamala shankar gupta","Sujit"};
  
  
  Arrays.stream(str).map(obj -> " Mr. "+ obj).forEach(System.out::println);
  
  
	List<Integer> ListofItem =Arrays.asList(1,2,3,4,5,20,56,59,33,77,99);
	
	
	List<Integer> collect = ListofItem.stream().sorted().collect(Collectors.toList());
  
	System.out.println(collect);
	
	
	int[]  val= {10,30,80,60,30,50,80,10,50,30};
	
	
	
	  //distinct() like set. no duplicate
	    System.out.println("-------------------------");
	   Arrays.stream(val).distinct().sorted().forEach(System.out::println);
	   
	   //Sum of numbers
	   //reduce()
	   //Combines all elements into a single result.
	   List<Integer> numbers=List.of(10,20,30,40);
	   int sum=numbers.stream().reduce(0,(a,b)->a+b);
	   System.out.println(sum);
	   
	   //Find maximum
	   List<Integer> no=List.of(10,50,20,40);
	   Optional<Integer> max=no.stream().reduce(Integer::max);
	   max.ifPresent(System.out::println);
	   
	  // 3. findFirst()
	   //Returns the first element as an Optional.
	   List<String> names=List.of("john","alice","bob");
	   Optional<String> first=names.stream().findFirst();
	   first.ifPresent(System.out::println);
	   
	   //anyMatch()
	  // Checks if at least one element satisfies the condition.
	   List<Integer> numbers1=List.of(5,10,15,20);
	   boolean result=numbers1.stream().anyMatch(n->n>18);
	   System.out.println(result);
	   
	   //allMatch()
	   //Checks if every element satisfies the condition.
	   
	   List<Integer> num=List.of(10,20,30);
	   boolean result1=num.stream().allMatch(n->n<5);
	   System.out.println(result1);
	   
	  // noneMatch()
	  //Checks if no element satisfies the condition.
	   List<Integer> nos=List.of(10,20,30);
	   boolean result11=nos.stream().noneMatch(n->n<0);
	   System.out.println(result11);
	   
	   //21/07/2026
	  // findfirst();  findAny()
	   
	   Integer[] arr1= {100000,20000,80,60052,600,58000,60000};
	   
	   
	   Optional<Integer> results = Arrays.stream(arr1).findFirst();
	   
	   Optional<Integer> results1 = Arrays.stream(arr1).findAny();
	   
      List<Integer> collect2 = Arrays.stream(arr1).skip(3).limit(3) .collect(Collectors.toList());
	   
	   System.out.println(results);
	   
	   System.out.println(results1);
	   
	   System.out.println(collect2);
	   
	   Integer[] arr2= {10000,200000,30000,3333,4444,5555,777};
	   List<Integer> result2=Arrays.stream(arr2).skip(2).limit(4).collect(Collectors.toList());
	   System.out.println(result2);
	   
	   Integer[] arr3= {10065,10066,10067,10068,11000,10069,10070,10070};
	  
	    Optional<Integer>  secondHighestSalary=  Arrays.stream(arr3).sorted(Comparator.reverseOrder()).
	    		skip(1).findFirst();
	  
	   System.out.println(secondHighestSalary);
		
	
	} // main methods

		
	
}  //close class
