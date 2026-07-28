package DSACoding;

import java.util.Arrays;

//Reverse a number.
public class ReverseNumber {
public static void main(String[] args) {
	Integer s1=1234;
	StringBuffer sbfr=new StringBuffer(String.valueOf(s1));
	System.out.println(sbfr.reverse());
	StringBuffer sbfr1=new StringBuffer(s1.toString());
	System.out.println(sbfr1.reverse());
	
	
	int[] array= {1,2,3,4,5,6};
	StringBuilder sbldr=new StringBuilder(Arrays.toString(array));
	
	System.out.println(sbldr.reverse());
}
}
