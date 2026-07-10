package com.core.String;

public class Practice1 {
	public static void main(String[] args) {
		StringBuilder bldr=new StringBuilder("khushi");
		System.out.println(bldr.reverse());
		
		StringBuffer bfr=new StringBuffer("123456789876543211234");
		
		System.out.println(bfr.capacity());
		
		
		StringBuffer bfr1=new StringBuffer("ram");
		System.out.println(bfr1.charAt(1));
		System.out.println(bfr1.compareTo(bfr));
		StringBuilder bfr2=new StringBuilder("ram is going to school");

		System.out.println(bfr2.codePointBefore(4));

		
		
	}

}
