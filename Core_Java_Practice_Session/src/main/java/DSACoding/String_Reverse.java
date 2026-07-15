package DSACoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.core.String.String_Builder_demo;

/*
Reverse a string.
Reverse each word in a sentence.
Check if a string is a palindrome.
Count vowels and consonants.
Count the occurrence of each character.
*/


public class String_Reverse {
public static void main(String[] args) {
	String s1="vijay";
	StringBuilder sbldr=new StringBuilder(s1);
	
	System.out.println(sbldr.reverse());
	
	
	//2
	String s2="i am going to school";
	StringBuffer sbfr=new StringBuffer(s2);
	System.out.println(sbfr.reverse());
	
	//3
	String name="rar";
	StringBuilder obj=new StringBuilder(name);
	System.out.println(obj.reverse());
	
	//4
//	String naam="Congratulation";
//	StringBuffer bldr=new StringBuffer();
//	System.out.println(bldr.);
	//5.Count the occurrence of each character.
	String str1="vijay";
	StringBuffer sb1=new StringBuffer(str1);
	System.out.println(sb1.length());
	
	
	
	
	//6Find the first non-repeated character
	String str="vijaya";
	Map<Character,Integer> map=new LinkedHashMap<>();
	for(char ch :str.toCharArray())
	{
		map.put(ch, map.getOrDefault(ch, 0)+1);
		
	}
	for(Map.Entry<Character,Integer> entry:map.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println("First non-repeated character:"+entry.getKey());
			break;
		}
	}
	
	
	//Reverse each word in a sentence. 
	
	String strobj="India is great";
	
	List<String> strobjlist=Arrays.asList(strobj.split(" "));
	
//	String result = strobjlist.stream()
//	        .map(word -> new StringBuilder(word).reverse().toString())
//	        .collect(Collectors.joining(" "));
	
	
String results=	strobjlist.stream()
               .map(word -> new StringBuilder(word)
		      .reverse().toString()).
               collect(Collectors.joining(" "));
        System.out.println(results);
	
	
	
	
	
	//H=CHARACTER
	//HELLO=>WORD
	//SENTENCE=>I AM GOING TO SCHOOL
        
        
        //6.find the first repeated character
        String str2="vijaya";
        StringBuilder sb2=new StringBuilder(str2);
        System.out.println(sb2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting())));
	
	
	
	
	
	
	
	
	
	
	
}
}
