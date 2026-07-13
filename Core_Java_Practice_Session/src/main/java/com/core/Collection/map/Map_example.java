package com.core.Collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_example {

	public static void main(String[] args) {
		
		
		//map(hashmap,linkedhashmap,treemap,hashtable,cocurrenthashtable)
		
		
		/*
		 * What is Hashmap?
		 * 
		A HashMap is a part of Java’s Collection Framework and implements the Map interface. 
		It stores elements in key-value pairs, where, Keys are unique. and Values can be duplicated.

		Internally uses Hashing, hence allows efficient key-based retrieval, insertion, 
		and removal with an average of O(1) time.
		HashMap is not thread-safe, to make it synchronized, use Collections.synchronizedMap().
		Insertion order is not preserved in HashMap. To preserve the insertion order, 
		LinkedHashMap is used and to maintain sorted order, TreeMap is used.
		HashMap allows one null key and multiple null values. If a null
		key is added multiple times, it overwrites the previous value.
		
		
		
		
              Map (Interface)
                  |
-----------------------------------------------------------------------
|                 |              |              |            |
HashMap       LinkedHashMap     TreeMap      Hashtable   ConcurrentHashMap
                            
		

		
		| Method                                                                                     | Description                                                        |
		| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------ |
		
		      Done/ Practice in class(10/07/2026)
		| `put(K key, V value)`                                                                      | Adds or updates a key-value pair.                                  |
		| `putAll(Map<? extends K, ? extends V> m)`  
		| `keySet()`                                                                                 | Returns all keys as a `Set`.                                                                                                        | Copies all entries from another map.                               |
		| `values()`                                                                                 | Returns all values as a `Collection`. 
		| `containsKey(Object key)`                                                                  | Checks whether a key exists.     
		
		
		 Needs TO DO Practice ON (11/07/2026)
		            |
		| `get(Object key)`                                                                          | Returns the value associated with the key.                         |
		| `getOrDefault(Object key, V defaultValue)`                                                 | Returns the value if present; otherwise returns the default value. |
		| `remove(Object key)`                                                                       | Removes the entry with the specified key.                          |
		| `remove(Object key, Object value)`                                                         | Removes the entry only if both key and value match.                |
		| `replace(K key, V value)`                                                                  | Replaces the value for an existing key.                            |
		| `replace(K key, V oldValue, V newValue)`                                                   | Replaces the value only if the current value matches `oldValue`.   |
		| `replaceAll(BiFunction<? super K, ? super V, ? extends V> function)`                       | Replaces every value using the given function.                     |
		| `containsValue(Object value)`                                                              | Checks whether a value exists.                                     |
		| `merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)`   | Merges a value with an existing value.                             |
		| `equals(Object o)`                                                                         | Compares two maps.                                                 |
		| `hashCode()`                                                                               | Returns the hash code of the map.                                  |
		| `entrySet()`                                                                               | Returns all key-value pairs as a `Set<Map.Entry<K,V>>`.            |
		| `size()`                                                                                   | Returns the number of entries.                                     |
		| `isEmpty()`                                                                                | Returns `true` if the map has no entries.                          |
		| `clear()`                                                                                  | Removes all entries.                                               |
		| `forEach(BiConsumer<? super K, ? super V> action)`                                         | Performs an action for each entry.                                 |

		*/
		//HashMap
		
		//Exam:
		HashMap<Integer, String>   objvalue= new HashMap<>();
		
		//put 
		objvalue.put(1, "Vijay");
		objvalue.put(2, "Ajay");
		objvalue.put(3, "Hyderabad");
		objvalue.put(4, "Mumbai");
		System.out.println(objvalue);
		
		//values 
		System.out.println("values set : "+ objvalue.values());
		
		//containsKey(Object key)
		System.out.println(" containsKey(Object key) :" +objvalue.containsKey(8786));
		
		//keySet()
		//syntax:
		//Set<K> keySet()
		System.out.println(objvalue.keySet());
		
		System.out.println("KeySet Example");
	     Set<Integer> set=objvalue.keySet();
		System.out.println(set);
		
		//PutAll
		HashMap<String, String> map1=new HashMap<>();
		
		map1.put("bzx0101", "Mumbai");
		map1.put("bzx0102", "Lucknow");
		
		HashMap<String, String> map2=new HashMap<>();
		
		map2.put("bzxpb0103", "Varanasi");
		map2.put("bzxpb0104", "Allahabad/Prayagraj");
		map2.put("bzxpb0105", "Bareli");
		map2.put("bzxpb0106", "Pratapgargh");
		map2.put("bzxpb0107", "Mau");
		map2.put("bzxpb0108", "Mirzapur");
		
		
		map1.putAll(map2);
		
		System.out.println(map1);
//=============================================================================Agar tum Collections Framework padh rahe ho, to get() ke saath add(), set(), remove(), contains(), indexOf(), aur size() bhi bahut important methods hain.
//		get(index) → List se element nikalta hai.
//		get(key) → Map se value nikalta hai.
		System.out.println("get() Example");
		
		System.out.println(map2.get("bzxpb0103"));
		System.out.println(map2.getOrDefault("bzxpb0103","khu"));
		System.out.println(map2.getOrDefault("103","khu"));
		
		System.out.println(map2.remove("bzxpb0103"));
		System.out.println(map2);
		System.out.println("remove=================================");
		System.out.println(map2.remove("bzxpb0105", "Bareli"));
		System.out.println(map2);
		System.out.println("===================================================================================================================");
		//replace(K key, V value)
		System.out.println(map2.replace("bzxpb0106", "Kushi Nagar"));
		System.out.println(map2);
		System.out.println(map2.replace("bzxpb0104", "Allahabad/Prayagraj", "Allahabad"));
		System.out.println(map2);
		//System.out.println(objvalue.replaceAll(4,"raaj"));
		System.out.println(map2.containsKey("bzxpb010"));
		System.out.println(map2.containsValue("Allahabad"));
		System.out.println(map2.size());
		System.out.println(map2.isEmpty());
		
		HashMap<Integer, String> map3=new HashMap<>();
		map3.put(7, "Varanasi");
		map3.put(8, "Varanasi");
		map3.clear();
		System.out.println(map3);
		System.out.println("===================================================================================================================");
		
		System.out.println(map2.entrySet());
		System.out.println(map2.keySet());
		System.out.println(map2.equals(map1));
		System.out.println(map2.hashCode());
	//	-------------------------------------------------------------------------------------------------------------
		
		//1.   == 
	   // 2.  equals methods
				  
				  
		String str1="Vijay";
		String str2="Vijay";
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3=new String("Vijay");
		System.out.println(str3.hashCode());
		System.out.println("-----------------identityHashCode------------------------------");
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println("-----------------identityHashCode------------------------------");
		
		
		if(str1==str2) {
			System.out.println("true");
		}
		
		if(str1==str3) {
			System.out.println("true");
		}
		
		
		//equals methods
		if(str1.equals(str3)) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
		
		
		
		
		
		
		System.out.println(map2.merge("bzxpb0108", "Mirza", (v1, v2) -> v1 + " & " + v2));
		
		//merge,forEach
			}
		
		
	
		
		
		
		
		
		
		
		

	


}
