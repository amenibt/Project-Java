package part2;

public class StaticExample {
	
	static int a=10;  // static variable
	int b=20; // Non static variable
	
	static void m1()
	{
		System.out.println("This is m1- static method");
		// access to variable b - non access
		// create object
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		
	}
	
	void m2()
	{
		System.out.println("This is m2- non static method");
		
	}
	
	void m3()
	{
		System.out.println("This is m3- non static method");
		
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}

	public static void main(String[] args) {
	
		//static method can access only static stuff directly without creating object
		System.out.println(a);
		System.out.println(StaticExample.a); // By class name
		
		
		m1();
		StaticExample.m1();// By class name
		
		/*System.out.println(b); // incorrect, because b is not static variable
		m2(); // incorrect, because m2 is not static variable*/
		
		//static methods can also access non static stuff but through object
		StaticExample se= new StaticExample();
		System.out.println(se.b); // non static variable through object
		se.m2();
		
		//call m3 by object
		se.m3();

	}

}
