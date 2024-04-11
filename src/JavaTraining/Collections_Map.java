package JavaTraining;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashmap is key value pair
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ajay");
		hm.put(2, "Vijay");
		hm.put(5, "Bhanu");
		hm.put(4, "Raj");
		
		System.out.println(hm);
		
		System.out.println(hm.get(5));
		
		hm.remove(6);
		System.out.println(hm);
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> mp = (Map.Entry<Integer, String>)itr.next();
			System.out.println(mp.getKey() + ":" + mp.getValue());
		}

	}

}
