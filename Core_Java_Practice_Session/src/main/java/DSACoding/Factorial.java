package DSACoding;

public class Factorial {
public static void main(String[] args) {
	int num=5;
	long factorial=1;
	int i=1;
	while(i<=num) {
		factorial*=i;
		i++;
	
	}
	System.out.println(factorial);
}
}
