package part4;

 interface A
 {
	 int a=10; // by default variables in interface are static and final
	 void m1(); // methods in interface are abstract
 }



public class Test implements A {
	
	// here we can implement the method
	public void m1() { // Modifier in class by default is default
		
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		/*Test t=new Test();
		t.m1();*/
		
		A a = new Test();  // Create memory for the interface becz interface don't have a memory by default
		a.m1();

	}

}
