package conditionnalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		int day=3;
		switch (day)
		{
		case 1:System.out.println("Sunday");
		case 2:System.out.println("Monday");
		case 3:System.out.println("Tuesday");
		case 4:System.out.println("Wednesday");
		case 5:System.out.println("Friday");
		case 6:System.out.println("Saturday");
		case 7:System.out.println("Thursday");
		default:System.out.println("Invalid week number");
		}

	}

}
