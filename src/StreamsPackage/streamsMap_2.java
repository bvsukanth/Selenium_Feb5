package StreamsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamsMap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stream with names length greater than 5 and to upper case
		Stream.of("Arjun","Bhanu","Ajay","Vikram","Venkat","Viswa").filter(name -> name.length()>5).map(u->u.toUpperCase()).forEach(s -> System.out.println(s));
		
		
		System.out.println("******************************************************************************");
		
		List<String> names = Arrays.asList("Arjun","Bhanu","Ajay","Vikram","Venkat","Viswa");
		
		//filter names starting with V and sort streams and convert to upper case and print all those
		names.stream().filter(s -> s.startsWith("V")).sorted().map(u -> u.toLowerCase()).forEach(s -> System.out.println(s));
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Prasad");
		al.add("Rama");
		al.add("Surya");
		al.add("Srikanth");
		al.add("Sunny");
		al.add("Virat");
		
		System.out.println("******************************************************************************");
		//we are merging 2 different streams, sort it, to uppercase (we have converted lists to streams)
		Stream.concat(names.stream(), al.stream()).sorted().map(u -> u.toUpperCase()).forEach(s -> System.out.println(s));
		
		System.out.println("******************************************************************************");
		//we are trying to find if Prasad name is there in stream
		boolean value = Stream.concat(names.stream(), al.stream()).anyMatch(s->s.contains("Prasad"));
		System.out.println(value);

	}

}





// Create 2 - List and ArrayList 
// Merge both as Stream 
// 1.) Print all names starting with "A" 2.) Print count of letters starting with "V" 3.) Sort and print all names in lowercase
