package Exception_handling;

public class Test {

	public static void main(String[] args) {
		try {
			int[] array= {10,20,30};
			System.out.println(array[5]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exe");
		}
	}

}
