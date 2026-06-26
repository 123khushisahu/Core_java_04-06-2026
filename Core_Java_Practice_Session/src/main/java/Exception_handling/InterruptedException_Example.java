package Exception_handling;

class Khushi extends Thread {
	public void run() {
		try {
			System.out.println("thread is running .....");
			
			Thread.sleep(6000);
			System.out.println("thread is completed  .....");
			
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("thread got interrupted......");
			
		}
		
		
	}
	
}



public class InterruptedException_Example {

	public static void main(String[] args) {
		
		Khushi k=new Khushi();
		k.start();
	
		k.interrupt();
	}

}
