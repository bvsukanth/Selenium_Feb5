package StreamsPackage;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamsDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Arjun");
		al.add("Bhanu");
		al.add("Ajay");
		al.add("Vikram");
		al.add("Venkat");
		al.add("Viswa");
		
		int count = 0;
		for(int i=0; i< al.size();i++)
		{
			String name = al.get(i);
			
			if(name.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println("Count from ArrayList : " + count);
		
		//Streams - Collection of strings : Streams can scan in parallel 
		//Streams - 3 steps - 1.) Create Stream 2.) Intermediate operation 3.) Terminal Operation 
		
		long count1 = al.stream().filter(name -> name.startsWith("A")).count();
		System.out.println("Count from Streams starting with A:" + count1);
		
		long count2 = Stream.of("Arjun","Bhanu","Ajay","Vikram","Venkat","Viswa").filter(name -> name.startsWith("V")).count();
		System.out.println("Count from Streams starting with V:" + count2);
		
		//print all names in Arraylist where length is greater than 4
		long count3 = al.stream().filter(s -> s.length()>4).count();
		System.out.println("Count from Streams where length greater than 4 : " + count3);
		
		//print all names in Arraylist where length is less than 4
		long count4 = al.stream().filter(s -> s.length()<=4).count();
		System.out.println("Count from Streams where length less than 4 : " + count4);
		
		al.stream().filter(a -> a.length()>4).limit(1).forEach(s -> System.out.println(s));

	}

}
