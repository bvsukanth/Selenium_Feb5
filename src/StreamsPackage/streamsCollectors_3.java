package StreamsPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsCollectors_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> newList = Stream.of("Arjun","Bhanu","Ajay","Vikram","Venkat","Viswa").filter(name -> name.startsWith("V")).map(u->u.toLowerCase())
		.collect(Collectors.toList());
		
		System.out.println(newList);
		System.out.println(newList.get(0));
		
		List<Integer> numbers = Arrays.asList(4,5,6,3,3,5,7,9,4,6,8,1,3,6,9,9,1,2,3,4,5,6,7,8);
		numbers = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(numbers);
		System.out.println(numbers.get(3));

	}

}
