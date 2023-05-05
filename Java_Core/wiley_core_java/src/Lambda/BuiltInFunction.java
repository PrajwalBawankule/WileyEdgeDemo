package Lambda;

import java.util.HashMap;
import java.util.function.Function;
import java.util.*;

public class BuiltInFunction {

	private static HashMap<Integer,String> Employee = new HashMap<>();
	
	public static void add(String name,int ID) {
		if(!Employee.containsKey(ID)) {
			Employee.put(ID,name);	
		}
		else {
			System.out.println("Employee already exists");
		}
	}
	public static void main(String[] args) {
		//function to get the name of employee from the id
		Function<Integer,String> get = (Integer ID) -> {
			if(Employee.containsKey(ID)) return Employee.get(ID);
			else
			   return "Invalid ID";
		};
		
		//Add employees to hashmap
		add("Prajwal",109);
		add("Parth",12);
		add("Raj",13);
		
		System.out.println(get.apply(109));
		System.out.println(get.apply(1));
	}
}
