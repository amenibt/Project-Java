package part1;

public class Calculation {
	
	//int values
	int x=10;
	int y=20;
	
	/*
	// case 1
	void sum()
	{
		System.out.println((x+y));
	}*/
	
	/*
	// case 2
	int sum()
	{
		return(x+y);
	}*/
	
	/*
	// case 3
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}*/
	
	
	// case 4
	int sum(int a, int b)
	{
		return (a+b);
	}
	
	
	
	public static void main(String[] args) {
		
		Calculation cal= new Calculation();
		/*
		// case 1
		cal.sum();*/
		
		/*
		// case 2
		int res=cal.sum();*/
	
 /*
		// case 3
		cal.sum(100, 200);*/
		
		// case 4
		System.out.println(cal.sum(100, 200));
	}

}
