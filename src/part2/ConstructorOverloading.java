package part2;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		//ConstructorOverloading co = new ConstructorOverloading(10,20);
		ConstructorOverloading co = new ConstructorOverloading(10,20.5);

	}

}