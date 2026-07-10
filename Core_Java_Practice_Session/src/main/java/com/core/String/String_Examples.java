package com.core.String;

public class String_Examples {

	public static void main(String[] args) {
		/*
		what is String in java 
		
		String is a predefined final class in Java that is used to store 
		and manipulate a sequence of characters (text). It belongs 
		to the java.lang package, so there is no need to 
		import it explicitly. String objects are immutable, 
		which means once a String object 
		is created, its value cannot be changed.
		
		
		Interview Me Important Points (Remember)
       ✅ String is a predefined final class.
       ✅ It belongs to the java.lang package.
       ✅ Used to store a sequence of characters.
       ✅ String objects are immutable.
       ✅ Can be created using:
        String Literal
        new keyword
        ✅ Supports many built-in methods like length(), charAt(), substring(), replace(), etc.
		
		| Method                  | Description                          | Example                            |
		| ----------------------- | ------------------------------------ | ---------------------------------- |
		| `length()`              | Returns the number of characters     | `"Java".length()` → `4`            |
		| `charAt(index)`         | Returns character at the given index | `"Java".charAt(2)` → `v`           |
		| `substring(begin, end)` | Extracts part of the string          | `"Java".substring(1,3)` → `av`     |
		| `toUpperCase()`         | Converts to uppercase                | `"java"` → `JAVA`                  |
		| `toLowerCase()`         | Converts to lowercase                | `"JAVA"` → `java`                  |
		| `equals()`              | Compares string contents             | `"abc".equals("abc")` → `true`     |
		| `equalsIgnoreCase()`    | Compares ignoring case               | `"Java".equalsIgnoreCase("JAVA")`  |
		| `compareTo()`           | Lexicographically compares strings   | `"abc".compareTo("abd")`           |
		| `contains()`            | Checks if substring exists           | `"Java".contains("av")` → `true`   |
		| `startsWith()`          | Checks prefix                        | `"Java".startsWith("Ja")`          |
		| `endsWith()`            | Checks suffix                        | `"Java".endsWith("va")`            |
		| `replace()`             | Replaces characters or strings       | `"Java".replace('a','o')` → `Jovo` |
		| `trim()`                | Removes leading/trailing spaces      | `" Java ".trim()` → `Java`         |
		
		

*/
		
		String obj="pm. modi ji";
		
		System.out.println(obj.concat("i"));
		
		
		
		
		//String Literal
		//exa:
		//string add hoga but modify nahi
		String s1="vijay kumar gupta mumbai ";
		String s12="vijay kumar gupta hyderabad";
		
		System.out.println(s1.concat(s12));
		System.out.println(s1);
		
		
		//The trim() method removes whitespace from the beginning and the end of a string:
		
		String s10="Kamala shankar gupta ";
		String s11="Kamala shankar gupta";
		if(s10.equals(s11)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		//trim used in below only value check
		if(s10.trim().equals(s11.trim())) {
			System.out.println("both are same");
		}
		else {
			System.out.println("not same");
		}
		
		
		
		
		
		//through new key words we can store or initialize value
		//exa:
		 String s2=new String("vijay");
		 System.out.println(s2.startsWith("vi"));
		 if(s2.startsWith("vi")) {
			 System.out.println("correct");
		 }
		 
		 
		 String str="java programming";
		 
		 System.out.println(str.length());
		 System.out.println(str.charAt(10));
		 System.out.println(str.substring(10, 13));
		 System.out.println(str.toUpperCase());
		 System.out.println(str.toLowerCase());
		 System.out.println("dsfadasdas :  "  +str.contains("a"));
		 
		 String s3="ajay";
		 String s4="vijay";
		 String s5="Ajay";
		 
		 
		 System.out.println(s3.equals(s5));
		 
		 System.out.println(s3.equalsIgnoreCase(s5));
		
		 
		 String s6="car";
		 String s7="cat";
		 
		 System.out.println(s6.compareTo(s7));
		 
		 
		 
		

	}

}
