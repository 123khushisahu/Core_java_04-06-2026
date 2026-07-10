package com.core.Collection.Set;




import java.util.*;
public class Set_EXAMPLE {

	public static void main(String[] args) {
		
		/*
		
		| **Collection**                                                        | **Collections**                                                                |
		| --------------------------------------------------------------------- | ------------------------------------------------------------------------------ |
		| `Collection` is an **interface**.                                     | `Collections` is a **utility class**.                                          |
		| It is part of the Java Collection Framework.                          | It provides utility methods to work with collections.                          |
		| Used to store and manipulate a group of objects.                      | Used to perform operations like sorting, searching, reversing, shuffling, etc. |
		| Implemented by classes like `ArrayList`, `HashSet`, and `LinkedList`. | Contains only static methods.                                                  |
		| It cannot be instantiated directly.                                   | No object is required because methods are static.                              |




 Set in Java
Definition

Set is an interface in the Java Collection Framework that stores unique elements. It does not allow duplicate values.

Definition: A Set is a collection that contains only unique elements and does not allow duplicate values.

Features of Set
✅ Stores only unique elements.
✅ Duplicate values are not allowed.
✅ Does not support indexing.
✅ Can contain one null element (HashSet and LinkedHashSet).
✅ It is part of the Collection Framework.


                Iterable (Interface)
                      │
              Collection (Interface)
                      │
                 Set (Interface)
              /          |         \
             /           |          \
     HashSet (Class)  LinkedHashSet (Class)  TreeSet (Class)



		*/
		
		
		//HashSet (Class)
		
		
		HashSet<Integer>  dataval=new HashSet<>();
		
		
		
		dataval.add(221303);
		dataval.add(2213452);
		dataval.add(3472534);
		dataval.add(784565);
		
		dataval.add(221303);
		dataval.add(221303);
		dataval.add(221303);
		dataval.add(221303);
		dataval.add(221303);
		System.out.println(dataval);
		
		
		//LinkedHashSet (Class)
		
		LinkedHashSet<String>   lkh=new LinkedHashSet<>();
		
		
		
		lkh.add("denny");
		lkh.add("mohan");
		lkh.add("sohan");
		lkh.add("dinesh");
		lkh.add("abhay");
		lkh.add("shyam babu");
		
		lkh.add("                                  ");
		lkh.add("                           ");
		lkh.add("");
		lkh.add("");
		lkh.add("");
		lkh.add("null");
		lkh.add("null");
		lkh.add("null");
		lkh.add("null");
		lkh.add("null");
		lkh.add("null");
		
		System.out.println(lkh);
		
		//TreeSet (Class)
		
		
		
		TreeSet<Integer> treeasetobject=new TreeSet<>();
		
		treeasetobject.add(54345);
		treeasetobject.add(544654);
		treeasetobject.add(43678);
		treeasetobject.add(67874);
		
		
		
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(12);
		ts.add(3);
		ts.add(43);
		ts.add(67);
		ts.addAll(treeasetobject);
		
		System.out.println(ts);
		
		
		

	}

}
