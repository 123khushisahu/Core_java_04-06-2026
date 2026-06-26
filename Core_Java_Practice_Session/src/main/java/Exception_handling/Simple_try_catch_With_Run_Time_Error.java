


package Exception_handling;

public class Simple_try_catch_With_Run_Time_Error {
	
	public static void main(String[] args) {
		
		
		/*
		 * Why Use Exception?
				Program crash होने से बचाने के लिए।
				Error को gracefully handle करने के लिए।
				Normal flow को maintain करने के लिए।
				User-friendly message दिखाने के लिए।
				Debugging और maintenance आसान बनाने के लिए।
		 * 
		 * 
		 * Checked Exceptions/Compile time error  in Java
		
		Common examples include IOException, SQLException, and ClassNotFoundException.
		compile time
		
		Unchecked Exceptions/Runtime Error in Java
		runtime
		Common examples include NullPointerException, ArithmeticException, and ArrayIndexOutOfBoundsException
		
		*/
		
		
	//	Null Pointer exception 
		
		String s=null;
		String s2="vijay";
		try {
			System.out.print(s2.length());
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		
		
		try {
			
			//int a=10;
			//int b=20;
			//
			//b=b+a;
			
			//a=b-a;
			//System.out.println(a);
			// String sadasgdjasgdjgasDGASDGAJSHGDASGDH;
			
			//b=b-a;
			//System.out.println(b);
			int m1=10;
			int m2=0;
			int m3=m1/m2;
			}
		
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			
		}
		
		
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception e");
			
		}
		
		
		//------------------------------------------------------
		//try ,catch,finally block example
		
		try {
			
			int a=20;
			int b=0;
			System.out.println("divide of two variable: " + (a/b));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("this is the finally block code success ::: ");
			
			
		}
		
		System.out.println("-------array example-------------------------");
		
		int[] array= {10,20,30,40};
		try {
			System.out.println(array[5]);
			
			throw new ArrayIndexOutOfBoundsException("this is the custome exception");
		}
		
		catch (Exception e) {
			e.printStackTrace();
			}
	}  // main methods close

} //class close
