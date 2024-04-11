package JavaTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Syntax for Arraylist
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Training");
		al.add("Training1");
		al.add("Training2");
		al.add("Training3");
		al.add("Training4");
		al.add("Training5");
		al.remove(4);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(al.get(1));
		
		System.out.println("******Enhanced For Loop********");
		
		for(String str : al)
		{
			System.out.println(str);
		}
		
		
		//contains method
		System.out.println(al.contains("Java1"));
		
		//convert Array to ArrayList 
		String[] name = {"Vijay", "Raju", "Raj"};
		//syntax
		List<String> list = Arrays.asList(name);
		list.add("Ram");
		
		//Array - print 10 numbers from Array
		//ArrayList - Add 10 elements, remove elements in position 8,3 and print again
		

	}

}
