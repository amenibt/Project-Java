package part3;

public class FinalVariableDemo {
	
	// without final we can chage variable
	final int speed=40; // final variable, we cannot change this value

	public static void main(String[] args) {
		
		FinalVariableDemo fm=new FinalVariableDemo();
		
		// we can change the variable value 40==> 100
		fm.speed=100; // compile time error because of final
		System.out.println(fm.speed);

	}

}
