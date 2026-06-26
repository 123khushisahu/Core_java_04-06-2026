package Exception_handling;

class Main {
	
	   public static int testExceptionDivide(int a, int b) throws ArithmeticException{
	       if(a == 0 || b == 0)
	         
	    	  
	    	   throw new ArithmeticException();
	       
	       return a/b;
	      
	   }
	   
	   
	   
	   public static void main(String args[]) {
		   int a=10,b=45;
			 Main obj=new Main(); new Main();
	       try{
	           testExceptionDivide(10, 0);
	       }
	       catch(ArithmeticException e){
	           //Handle the exception
	    	   System.out.println("adeasd");
	    	   
	       }
		   finally{
	           // all any
	       }
	   }
	}

