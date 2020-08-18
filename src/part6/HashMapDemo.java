package part6;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		//HashMap hm=new HashMap();// declaration 1
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding pairs into HashMap
		hm.put(101, "Ameni");
		hm.put(102, "Imen");
		hm.put(103, "Mohamed");
		hm.put(104, "Houssem");
		
		System.out.println(hm);
		
		//remove a pair from hashmap
		hm.remove(103); //remove by key value
		System.out.println("After removing a pair " +hm);
		
		//Reading pairs using for loop
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
	}

}
