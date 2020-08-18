package part1;

public class Empl {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}

  
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(); // Creating object 1
		emp1.eid=101;
		emp1.ename="Mohamed";
		emp1.sal=80.00;
		emp1.deptno=10;
		emp1.job="Test Automation";
		emp1.display();
		
		Employee emp2 = new Employee(); // Creating object 2
		emp2.eid=101333;
		emp2.ename="Jhon";
		emp2.sal=80.00;
		emp2.deptno=10000;
		emp2.job="Test Manual";
		emp2.display();
		
		
		

	}

}
