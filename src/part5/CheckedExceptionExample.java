package part5;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program in progress");
		
		try
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is existed");

	}

}
