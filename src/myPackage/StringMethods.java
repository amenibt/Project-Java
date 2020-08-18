package myPackage;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="welcome";
		String s1="to java";
		
		// length of a string
		System.out.println(s.length());
		
		//joinnig of string
		System.out.println(s.concat(s1));
		
		
		//trimming the string 
		s="   welcome    ";
		System.out.println("Before trimming string is: " +s);
		// Remove space
		System.out.println("After trimming string is: " +s.trim());
		
		//Contains()--> return true
		System.out.println(s.contains("wel"));
		
		//comparing string equals()
		s="Welcome";
		System.out.println(s.equals("Welcome")); // True
		System.out.println(s.equals("wel    come")); // False
		System.out.println(s.equals("welcome")); // False
		
		//replacing characters
		s="Welcome to java";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("java", "selenium"));
		
		//extracting substring from the main string
		s="Welcome";
		System.out.println(s.substring(0,4)); // Welc
		
		//Converting case 
		s="WELCOME";
		System.out.println(s.toLowerCase());
		
		s="welcome";
		System.out.println(s.toUpperCase());

	}

}
