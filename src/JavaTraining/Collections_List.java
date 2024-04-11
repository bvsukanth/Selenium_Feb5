package JavaTraining;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections_List {
	
	//Collections are used to manage data
	//List is interface - ArrayList, Linkedlist, Vector classes will implement this 
	//Arrays has fixed size, ArrayList is dynamic

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println(al);
		
		//add elements into specific index
		al.add(0,2);
		System.out.println(al);
		
		//remove at a index
		al.remove(2);
		System.out.println(al);
		
		//get value at index 
		System.out.println(al.get(2));
		
		//check if number present in Arraylist
		System.out.println(al.contains(5));
		
		//get index of element
		System.out.println(al.indexOf(3));
		
		//check if array is empty
		System.out.println(al.isEmpty());
		
		//size of arraylist
		System.out.println(al.size());
	}

}
