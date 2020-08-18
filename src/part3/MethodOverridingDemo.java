package part3;

//base class
class Bank
{
	// same method
	double rateOfInterest()
	{
		return 0;
	}
	}

class SBI extends Bank
{
	// same method
	double rateOfInterest()
	{
		return 10.5; // change body
	}
	}

class ICICI extends Bank 

{
	// same method
		double rateOfInterest()
		{
			return 9.5;
		}
	
	}

class AXIS extends Bank
{
	// same method
			double rateOfInterest()
			{
				return 8.5;
			}
	}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
		
		ICICI icici = new ICICI();
		System.out.println(icici.rateOfInterest());
		
		AXIS axis = new AXIS();
		System.out.println(axis.rateOfInterest());
		

	}

}
