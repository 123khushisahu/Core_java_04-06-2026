package com.core.String;

public class String_Builder_demo {

	
	public static void main(String[] args) {
		  String username123="vijay";

	//	String username123="raju";
		System.out.println(username123);
		
		int x=10;
		int y=20;
		
		x=x+y;
		
		System.out.println(x);
		
		
		
		StringBuilder sb=new StringBuilder("vijay bahadur");
		
		
	//	1. append()

	//	String के end में data जोड़ता है।
		System.out.println(sb.append(" gupta"));
		
		
		
		//2. insert()
		
		//fresh data we can insert it 
		//Specified index पर data insert करता है।
		
		StringBuilder sb1=new StringBuilder("java Ameerpet hyderabad");
		sb1.insert(4,   " 500018");
		System.out.println(sb1);
		
	//	3. replace
		//going to replace specifed range 
		
		StringBuilder sb3=new StringBuilder("I love india");
		sb3.replace(7, 12, "i LOVE BHARAT HAR -2 MODI .....");
		System.out.println(sb3);
		
		
		
		
		//4.delete()
		//Specified range we can delete it 
		
		//sb.delete(startIndex, endIndex);
		
		//startIndex → included (deletion starts here)
		//endIndex → excluded (this index is not deleted)
		
	  //	delete(start, end)
	  //      ↑      ↑
	  // include   exclude
		
		
		
		StringBuilder sb4=new StringBuilder("221303-123456789");
		sb4.delete(0, 8);
		System.out.println(sb4);
		
	
		
		//5. 	deleteCharAt()
		
		StringBuilder sb5=new StringBuilder("Khushi"); // K=0,  h=1,  u=2, s=3 , h=4, i=5 
		
		sb5.deleteCharAt(0);
		System.out.println(sb5);
		
		// 6. reverse()
		//it  will reverse element
		StringBuilder sb6=new StringBuilder();
		sb6.insert(0, "vijay");
		System.out.println(sb6);
		
		sb6.reverse();
		System.out.println(sb6);
		
		//7.charAt()
		//charAt() Method in StringBuilder (Java)

		//charAt() method का उपयोग किसी specific index पर मौजूद character को पढ़ने (get) के लिए किया जाता है।
		
		StringBuilder sb7=new StringBuilder("Manoj kumar gupta  Nagpur maharashtra");
		     char ch=sb7.charAt(7);
		System.out.println(ch);
		System.out.println(sb7.charAt(7));
		
		
		//setCharAt
		StringBuilder sb8 = new StringBuilder("Java");
		
		System.out.println(sb8.length());
		

        sb8.setCharAt(0, 'k');
        sb8.setCharAt(3, 'm');

        System.out.println(sb8);
        
        
        
        
        
        
        System.out.println("==========================");
        
       // Empty StringBuilder की default capacity = 16 hoti h
        
        
        StringBuilder sb9 = new StringBuilder("Java");

        System.out.println("Length = " + sb9.length());
        System.out.println("Capacity = " + sb9.capacity());

        sb9.trimToSize();

        System.out.println("After trimToSize()");
        System.out.println("Length = " + sb9.length());
        System.out.println("Capacity = " + sb9.capacity());
        
        
        
        
        
        
       // substring(int start) jo index diya vahi se start hoga thats it
        
        StringBuilder stringbuilder=new StringBuilder(" my name is vijay");
        
        //;
        System.out.println(stringbuilder.substring(4));
        
        
		
      //  substring(int start, int end)
       // substring(int start, int end) start index se end index-1 tak characters return karta hai.

        	//	✅ Start index → Included

        	//	❌ End index → Excluded
        
        StringBuilder sb10 = new StringBuilder("vijay  kumar gupta madhorampur gopiganj");
        
        System.out.println(sb10.substring(0, 10));
        
        System.out.println(sb10.indexOf("gupta"));
        
        

       // System.out.println(sb10.substring(0, 10));
       // System.out.println(sb10);
        
        
        
        
        System.out.println("------------------------------------------------------");
        
       
        
        
        
        StringBuilder sb11=new StringBuilder();
        
        sb11.append("Mumbai and Dubai");
        sb11.append(" Tier one city");
      
        String   strobj=sb11.toString();
      
       
        
        
        System.out.println(strobj);
        
        
        System.out.println(sb11);
        
        
        
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
