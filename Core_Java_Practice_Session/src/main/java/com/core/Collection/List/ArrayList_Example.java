package com.core.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Example {

	private static int ArrayList;

	public static void main(String[] args) {
		
	/*	Java ArrayList
		An ArrayList is like a resizable array.

		It is part of the java.util package and implements the List interface.

		The difference between a built-in array and an ArrayList in Java, 
		is that the size of an array cannot be modified (if you want to add or 
				remove elements to/from an array, you have to create a new one).
		While elements can be added and removed 
		from an ArrayList whenever you want.
		
		
		Now you can use methods 
		like : 
		add(), get(), set(), and remove() 
		
		to manage your list of elements.
		
		
		
		
		*/
		
		ArrayList<Integer> array=new ArrayList<>();
		array.add(19);
		System.out.println(array);
		
		//System.out.println(array.get(1));
		
		System.out.println(array.set(0, 12));
		System.out.println(array);
		
		ArrayList<String> str=new ArrayList<>();
		
		List<String> list=str;
	
		
		Object str1=new Object();
		
		//add
		str.add("VIJAY");	
		str.add("AJAY");
		str.add("MANOJ");
		str.add("KAMAL");
		str.add("SOHAN");
		System.out.println(str);
		
		
	    //get
		System.out.println(str.get(2));
		
		//set
		System.out.println(str.set(3, "221303"));
		System.out.println(str);
		
		// remove
		str.remove(0);
		System.out.println(str);
		str.remove(3);
		//str.remove("SOHAN")
		System.out.println(str);
		System.out.println(str.size());
		System.out.println("Empty or not: ");//empty""//blank" "//null means kw
		ArrayList<String> str2=new ArrayList<>();
		
		if(!str2.isEmpty()) {
		System.out.println("data is present");
		
		}else {
			System.out.println("no data");
		}
		
		list.clear();
		
		System.out.println(list);
		
		
		
		
		//-------------------Integer or number Adding---------------------------------	
		
		ArrayList<Integer> array1=new ArrayList<>();
		ArrayList<Integer> array2=new ArrayList<>();
		
		
		
		array1.add(10);
		array1.add(11);
		array1.add(12);
		array1.add(14);
		
		
		
		array2.add(16);
		array2.add(17);
		array2.add(18);
		array2.add(19);
		array1.addAll(array2);
		System.out.println(array1);
		
		//-------------------String Adding---------------------------------
		
		ArrayList<String> arr3=new ArrayList<>();
		arr3.add("Vijay");
		arr3.add("manoj");
		arr3.add("yasir");
		arr3.add("jhanavi");
		arr3.add("mohan");
		arr3.add("kalia");
		arr3.add("jocker");
		arr3.add("denny");
		arr3.add("sohan");
		
		
		
		
		ArrayList<String> arr4=new ArrayList<>();
		arr4.add("Vijaya");
		arr4.add("manoja");
		arr4.add("khushi");
		
		arr3.addAll(arr4);
		System.out.println(arr3);
		
		
		System.out.println(arr3.equals(arr4));
		//System.out.println(arr3);
		arr3.containsAll(arr4);
		System.out.println(arr3);
		
		
		
		
		
//		ArrayList<String> copy =ArrayList<String>list.clone();
//		System.out.println(copy);
//		
		
		

	}

}
