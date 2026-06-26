package Exception_handling;

public class Illegal_argument_exception {
	
	
	
	
	
	
	
	public int createPassword(int a)  {
		
		try {
			if(a>0 && a<=100) {
				
				System.out.println("marks is valid");
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return a;	
	}

	public static void main(String[] args) {
		
		try {
			int[] array=new int[-10];	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		Illegal_argument_exception obj=new Illegal_argument_exception();
		obj.createPassword(-200);
		
		
		

	}

}
