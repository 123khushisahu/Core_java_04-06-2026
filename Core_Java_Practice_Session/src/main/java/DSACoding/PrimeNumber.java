package DSACoding;

/*
 * Check if a number is prime.
Print all prime numbers from 1 to N.
Print the Fibonacci series.
Find the factorial of a number.
Reverse a number.
Check if a number is a palindrome.-done



Check if a number is a perfect number.
Find the GCD of two numbers.
Find the LCM of two numbers.
Swap two numbers without a third variable.
Check if a number is even or odd.
Sum of digits of a number.
Count digits in a number.
Generate multiplication tables.*/


public class PrimeNumber {

	public static void main(String[] args) {
		int n=20;
		
		for(int number=2;number<=n;number++) {
			int count=0;
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(number);
			}
		}
		}
}
