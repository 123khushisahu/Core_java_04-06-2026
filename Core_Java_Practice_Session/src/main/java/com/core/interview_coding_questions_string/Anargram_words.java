package com.core.interview_coding_questions_string;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Anargram_words {

	public static void main(String[] args) throws IOException {
		
	String  str="night";   //
	String  str2="thing";
	
char[] c1=str.toCharArray();
char[] c2=str2.toCharArray();


System.out.println(c1);
System.out.println(c2);

Arrays.sort(c1);
Arrays.sort(c2);

System.out.println("------------------------------------------------");

System.out.println(c1);
System.out.println(c2);




if(Arrays.equals(c1, c1)) {
	System.out.println("this is the anargram words.");
	
}else {
	System.out.println("this is not the anargram words.");
}



InputStreamReader reader=new InputStreamReader(null);
try {
	reader.hashCode();
	
	
	int i=7/0;
	
}catch (Exception e) {
	e.printStackTrace();
	
}

finally {
	reader.close();
	
}


		
	
	
		
		

	}

}
