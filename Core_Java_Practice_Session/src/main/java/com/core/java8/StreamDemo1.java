package com.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1{
public static void main(String[] args) {
	ArrayList<Integer> array=new ArrayList<Integer>();
	array.add(10);
	array.add(20);
	array.add(30);
	array.add(40);
	System.out.println(array);
	//mapping
	ArrayList<String> array1=new ArrayList<String>();
	array1.add("khushi");
	array1.add("mohan");
	array1.add("kamala");
	array1.add("sita");
	System.out.println(array1);
	
	List<String> collect = array1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(collect);
	
	ArrayList<String> array2=new ArrayList<String>();
	array2.add("khushi");
	array2.add("mohan");
	array2.add("kamala");
	array2.add("sita");
	System.out.println(array2);
	
	long collect2 = array2.stream().filter(s->s.length()==6).count();
	System.out.println(collect2);
	
	
	//sorting
	
	ArrayList<Integer> array3=new ArrayList<Integer>();
	array3.add(10);
	array3.add(2000);
	array3.add(30);
	array3.add(100);
	System.out.println(array3);
	List<Integer> collect3 = array3.stream().sorted().collect(Collectors.toList());
	System.out.println(collect3);
	
	System.out.println("==========================");
	
	List<Integer> collect4 = array3.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
	System.out.println(collect4);
	
	System.out.println("min/max");
	
	Integer min = array3.stream().min((s1,s2) ->s1.compareTo(s2)).get();
	System.out.println(min);
	
	Integer max = array3.stream().max((s1,s2) ->s1.compareTo(s2)).get();
	System.out.println(max);
	
System.out.println("forEach");

ArrayList<Integer> array0=new ArrayList<Integer>();

array0.add(22);
array0.add(2);
array0.add(12);
System.out.println(array0);
array0.stream().forEach(s->System.out.println(s));

array0.stream().forEach(System.out::println);

	




	
	
}
}
