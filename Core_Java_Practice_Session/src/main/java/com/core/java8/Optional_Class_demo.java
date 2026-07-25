package com.core.java8;

import java.util.Optional;

public class Optional_Class_demo {
	
	/*
	Optional_Class_definition
	
	In Java 8, Optional is a container object introduced in the 
	java.util package to represent a value that may or may not be present. 
	It helps avoid NullPointerException and makes code more readable.
	
| Method                |	Description                                                   |
| --------------------- | ------------------------------------------------------------- |
| `isPresent()`         | Returns `true` if a value exists.                             |
| `get()`               | Returns the value (throws `NoSuchElementException` if empty). |
| `orElse(T value)`     | Returns the value if present, otherwise the default value.    |
| `orElseGet(Supplier)` | Returns the value or generates a default value lazily.        |
| `orElseThrow()`       | Throws an exception if no value is present.                   |
| `ifPresent(Consumer)` | Executes code only if a value is present.                     |
| `map(Function)`     2036.
| Transforms the value if present.                              |
| `filter(Predicate)`   | Returns the value only if it matches a condition.             |

	*/
	

	public static void main(String[] args) {
		
		//Example 1: Using orElse()
		
		//Optional<String> name = Optional.ofNullable(null);

		//String result = name.orElse("Default Name");

		//System.out.println(result); // Default Name
		String param="khushi";
		
	Optional<String> name = Optional.ofNullable(param);// null value check
	  String defaultname = name.orElse("Vijay kumar gupta")	;// def val set
	  
	  System.out.println(defaultname);
	  
	  
	 /* 
	  isPresent() 

	  isPresent() method checks whether the Optional object contains a value or not.

	  Syntax
	  boolean isPresent()
	  
	  Return Value
	  true → If a value is present.
	  false → If the Optional is empty.
	  
	  */
	  
	  
	  
		if (!(param == null)) {
		
		//Optional<String>   name1 = Optional.of("vijay ji");
		Optional<String>   name1 = Optional.empty();
	    if(name1.isPresent()) {
	    	
	    	System.out.println("value is present : " +name1.get());
	    }
	    else {
	    	System.out.println("value is not present : " +name1);
	    }	
	}
	  
}

}
