package DSACoding;

public class Palindrome {
public static void main(String[] args) {
	int number=120;
	int original=number;
	int reverse=0;
	while(number !=0) {
		int digit=number%10;
		reverse=reverse*10+digit;
		number=number/10;
		
	}
	if(original==reverse) {
		System.out.println("palindrome number");
	}else {
		System.out.println("not apalindrome number");
	}
}
}
