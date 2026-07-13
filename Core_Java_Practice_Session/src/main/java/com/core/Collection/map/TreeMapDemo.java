package com.core.Collection.map;

import java.util.*;
public class TreeMapDemo {
//not null key allow in Treemap but hashmap and LinkedHashmap me one null key is allowed
	public static void main(String[] args) {
		TreeMap<String,String> map=new TreeMap();
		map.put("BZXPB3025", "Hyderabad");
		map.put("79887", null);
		map.put(null, null);
		System.out.println(map);
		
		

	}

}
