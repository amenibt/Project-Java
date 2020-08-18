package part6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// How to declare arraylist
		//ArrayList list=new ArrayList(); // we can store any type of elements
		//ArrayList <Integer> list=new ArrayList <Integer>(); //we can store Integer elements
		
		ArrayList <String> list=new ArrayList <String>(); // we can store String elements
		
		
		//Adding values to ArrayList
		list.add("Ameni");//0
		list.add("Imen");//1
		list.add("Mohamed");//2
		list.add("Houssem");//3
		
		//list.add(100); //Number
		
		//print all the value
		System.out.println(list);
		
		//size of array list
		System.out.println(list.size());
		System.out.println("Before removing element " +list);
		
		//Remove an element
		list.remove(2);
		System.out.println(list.size());
		System.out.println("After removing element" +list);
		
		//insert a new element into array list
		list.add(1, "Julien");
		System.out.println(list.size());
		System.out.println("After inserting element " +list);
		
		// read values from array list using for loop
		
	/*	for(String s:list)
		{
			System.out.println(s);
		}*/
		
		for(Object s:list)   // Object can store any type of value
		{
			System.out.println(s);
		}

	}

}
