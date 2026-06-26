package Exception_handling;

public class ClassNotFoundException123 {

	public static void main(String[] args) {
		
		
		//4.ClassNotFoundException in java 
		try {
		Class.forName("Exception_handling.Test");
		System.out.println("class found");
			
		}catch (Exception e) {
			System.out.println("class not found");
		}
		
		
		
		//5.Interrupted Exception in java 
		/*InterruptedException कहाँ ज़्यादा Use होती है?

				InterruptedException मुख्य रूप से Multithreading में use होती है।

				जब एक thread किसी काम के दौरान wait, sleep, या join की 
				स्थिति में होती है और कोई दूसरा thread उसे interrupt कर देता है, तब InterruptedException आती है।
				
				*/
		
		
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
				
		
		
		

	}

}
