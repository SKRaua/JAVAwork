package chapter10.comparableemployee;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Tests employee class. 
 * @author Qi Wang
 * @version 1.0
 */
public class Helper {
	/**
	 * Creates a list of employees, and print them in order. 
	 * @param arg A reference to a string array containing command-line arguments
	 */
	public static void start(){
		//Create a list of employees
		ArrayList<ComparableEmployee> lists = new ArrayList<ComparableEmployee>();
		//Create a list.
		create(lists);
		
	    //Print the list.
		print(lists);
		
		//Display the list
		Collections.sort(lists);
		
		//Print the list.
		print(lists);
	}
	
	/**
	 * Creates a list of employees.
	 * @param lists a reference to a list of employees
	 */
	public static void create(ArrayList<ComparableEmployee> lists){
		lists.add(new ComparableEmployee("John Smith", 300000.0));
		lists.add(new ComparableEmployee("Alan Smith", 400000.0));
		lists.add(new ComparableEmployee("Joe Jones ", 300000.0));
	}
	
	/**
	 * Displays a list of employees.
	 * @param lists A reference to a list of employees
	 */
	public static void print(ArrayList<ComparableEmployee> lists){
		System.out.println("The list of employees:");
		for(int i = 0; i < lists.size(); i++){
			System.out.println(lists.get(i));
			System.out.println();
		}
		System.out.println();
	}
}
