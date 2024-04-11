package JavaTraining;

import java.util.HashSet;
import java.util.Iterator;

public class Collections_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs  = new HashSet<String>();
		
		hs.add("Raj");
		hs.add("Ajay");
		hs.add("Bhanu");
		hs.add("Vijay");
		hs.add("Viswa");
		
		System.out.println(hs);
		
		hs.remove("Viswa");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		//Iterator
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
