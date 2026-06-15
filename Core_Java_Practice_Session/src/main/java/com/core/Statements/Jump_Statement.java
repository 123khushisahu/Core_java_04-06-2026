package com.core.Statements;

public class Jump_Statement {

	public static void main(String[] args) {
		/*Jump Statements का उपयोग program के normal flow को बदलने के लिए किया जाता है।

Java में 3 Jump Statements होती हैं:

break
continue
return	*/
		/*
		 1.break
		Use:

		Loop या switch को तुरंत terminate (बंद) करने के लिए।
		*/
		
		for(int i=1;i<=5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		
/*2. continue
Use:Current iteration को skip करके अगली iteration पर जाने के लिए।
*/
	for(int i=1;i<=5;i++) {
		if(i==3) {
			continue;
		}
		System.out.println(i);
	}
		
	}
}


