package part1;

public class Student {
	
	
	int sid;
	String sname;
	char grade;
	
	//assign values to variable by using reference
	void getValues(int id, String name, char g) // parameter
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	//assign values to variable by using constructor
	Student(int id, String name, char g)
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	//By using Method
	void display()
	{
		System.out.println(sid+""+sname+""+grade);
	}

}
