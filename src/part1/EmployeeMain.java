package part1;

public class EmployeeMain { // We can use and execute becz class Employee is in the same package

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(); // Creating object 1
		emp1.eid=101;
		emp1.ename="Mohamed";
		emp1.sal=80.00;
		emp1.deptno=10;
		emp1.job="Test Automation";
		emp1.display();
		
	}

}
