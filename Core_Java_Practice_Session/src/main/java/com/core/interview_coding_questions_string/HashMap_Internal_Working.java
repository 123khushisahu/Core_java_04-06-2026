package com.core.interview_coding_questions_string;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Internal_Working {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(101, "java");
		map.put(102, "scala");
		map.put(103, "DotNet");
		map.put(104, "scala");
		map.put(105, "php");
		
		System.out.println(map);
		
		System.out.println(map.get(104));
		
		System.out.println("--------------------------------------------------");
		
		for (Map.Entry<Integer, String>  mapval: map.entrySet() ) {
			
			if(mapval.getValue()=="scala") {
				
				System.out.println(mapval.getKey()   + "   "+ mapval.getValue());
				
			}
			
			
		}
		
		
		
		
		

	}

}
