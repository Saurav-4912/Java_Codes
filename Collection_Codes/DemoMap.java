package Collection_Codes;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class DemoMap {
  public static void main(String[] args) {

		// Key-Value pair
		// hashmap not synchronized

		HashMap<Integer, String> ob = new HashMap<>();

		ob.put(101, "AAA");
		ob.put(102, "BBB");
		ob.put(103, "CCC");
		// ob.put(345, "DDD");
		// ob.put(101, "EEE");

		System.out.println(ob);

		Set<Integer> s = ob.keySet(); // ob.setkey() return all keys
		System.out.println(s); // [101 , 102 , 103]

		for (Integer key : s) {
			String value = ob.get(key);
			System.out.println(key + "--->" + value);
		}

		// Synchronized
		Hashtable<Integer, String> ob1 = new Hashtable<>();
		ob1.put(1, "AAA");
		ob1.put(99, "BBB");
		ob1.put(9, "CCC");
		// ob.put(345, "DDD");
		// ob.put(101, "EEE");

		System.out.println(ob1);

		Set<Integer> set = ob1.keySet(); // ob.setkey() return all keys
		System.out.println(set); // [101 , 102 , 103]

		// using for-each loop
		for (Integer key : set) {
			String value = ob1.get(key);
			System.out.println(key + "--->" + value);
		}

		System.out.println("---------------------------");
		// Using Enumeration

		Enumeration<Integer> keys = ob1.keys();
		while (keys.hasMoreElements()) {

			Integer rno = (Integer) keys.nextElement();
			String name = ob1.get(rno);
			System.out.println(rno + "---->" + name);
		}

	}
}
