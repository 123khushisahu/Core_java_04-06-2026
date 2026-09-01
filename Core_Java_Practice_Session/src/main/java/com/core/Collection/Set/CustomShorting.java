package com.core.Collection.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.naming.ldap.SortControl;


class student{
	  
	  int id;
	  String name;
	  public student(int id, String name) {
		
		this.id = id;
		this.name = name;
	  }
	  @Override
	  public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	  }
	
	  
	 
  }

   class sortByName implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

	
	   
	   
	   
   }

public class CustomShorting {
	
	 public static void main(String[] args) {
		  List<student> std = new ArrayList<>();
		    std.add(new student(1,"Rahual"));
		    std.add(new student(3,"Ramaesh"));
		    std.add(new student(2,"Raju"));
		    
		    
		    
		    Collections.sort(std,new sortByName());
		    
		    
		    // comparable
		     List<Integer> li =new ArrayList<>();
		     li.add(1);
		     li.add(2);
		     li.add(5);
		     li.add(3);
		     
		     System.out.println(li);
		     Collections.sort(li);
		     System.out.println("After sorting ");
		     System.out.println(li);
		     
		     
		     
		     
		    for(student s:std) {
		    	System.out.println(s);
		    }
		  
		    
	}

}
