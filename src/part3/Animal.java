package part3;

public class Animal {
	
	String color="white";
	
	void eating()
	{
		System.out.println("Eating..............");
	}
	
	Animal()
	{
		System.out.println("Animal is created");
	}
	
}

	class Dog extends Animal
	{
		// we can also call this  overriding - difefrent body
		String color="Black";
		
		// 1
		/*void displayColor()
		{
			System.out.println(super.color); // when add super - we print black and white
			System.out.println(color); // Black
			
	}*/
		
		//2
		/*void eating()
		{
			System.out.println("Eating Bread ........");
			super.eating(); // we execute the method in Animal class
		}*/
		
		//3
		Dog()
		{
			super(); // add super() - invoke parent class constructor
			System.out.println("Dog is created");
		}
	

	}

	
