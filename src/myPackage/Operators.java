package myPackage;

public class Operators {

	public static void main(String[] args) {

		int a=10;
		int b =20;

		//Arethmetic operators --> + - * /
		System.out.println("----------Arethmetic operators--------");
		System.out.println("Sum of a and b is: " +(a+b));
		System.out.println("Diff of a and b is :" +(a-b));


		//Relational operators ---> == <> <= >= !=
		System.out.println("----------Relational operators--------");
		System.out.println(a==b);
		System.out.println(a<=b);



		//Logical operators && || !
		// works between boolean

		boolean x=true;
		boolean y=false;
		
		System.out.println("----------Logical operators--------");
		System.out.println(x&&y);
		System.out.println(!x);
		
	


	}

}
