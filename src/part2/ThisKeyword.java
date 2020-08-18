package part2;

public class ThisKeyword {
	
	int a,b;
	
	/*void getValues(int x, int y)
	{
		a=x;
		b=y;
	}*/
	
	void getValues(int a, int b) //  method variables/external variables using this (La methode getValues ne peut pas differencier entre variable de la methode et la variable de la classe c'est pour cela on a ajouté this)
	{
		this.a=a;
		this.b=b;
	}
	
	
	
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ThisKeyword th=new ThisKeyword();
		th.getValues(10, 20);
		th.printValues();
		

	}

}
