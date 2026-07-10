package com.core.String;

class MyThread extends Thread {

   StringBuffer sbf;

    MyThread(StringBuffer sb) {
        this.sbf = sb;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(sbf.append(i).append(" "));
        }
    }
}









public class StringBuffer_Example {

	public static void main(String[] args) throws Exception {
		
	/*	Real-Life Example: Bank Counter

		Socho ek bank me 2 employees ek hi register me customer names likh rahe hain.

		Employee 1 → "Rahul"
		Employee 2 → "Amit"

		Dono same time likhne ki koshish karte hain.

		Agar synchronization na ho to register ka data kharab ho sakta hai.

		StringBuffer kya karta hai?

		Ek time par sirf ek thread ko object modify karne deta hai.
		Dusra thread wait karta hai.
		Isliye data safe rehta hai.
		
		
		*/
		
		StringBuffer sf=new StringBuffer();
		
		MyThread myt1=new MyThread(sf);
		
		MyThread myt2=new MyThread(sf);
		
		myt1.start();
		myt2.start();
		
		myt1.join();
		myt2.join();
		
		System.out.println(sf);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
