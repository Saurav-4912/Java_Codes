package Collection_Codes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoSet {
  public static void main(String[] args) {

		// Set - Store Unique Values
		// LinkedHashSet - It is internally used LinkedList.
		// HashSet - It is internally used HashTable.
		// TreeSet - It is internally used Tree.

		// HashSet = Unique , Order Change
		HashSet<String> ob = new HashSet<>();

		ob.add("Pune");
		ob.add("Mumbai");
		ob.add("Pune");
		ob.add("Delhi");
		ob.add("Banglore");

		System.out.println(ob);  //[Delhi, Banglore, Pune, Mumbai]

		// LinkedHashSet = Unique , Order Unchange
		LinkedHashSet<String> ob1 = new LinkedHashSet<>();

		ob1.add("Pune");
		ob1.add("Mumbai");
		ob1.add("Pune");
		ob1.add("Delhi");
		ob1.add("Banglore");

		System.out.println(ob1);  //[Pune, Mumbai, Delhi, Banglore]

		// TreeSet = Unique , Order Sorted
		TreeSet<String> ob2 = new TreeSet<>();

		ob2.add("Pune");
		ob2.add("Mumbai");
		ob2.add("Pune");
		ob2.add("Delhi");
		ob2.add("Banglore");

		System.out.println("Ascending Order : " + ob2);//Ascending Order:[Banglore, Delhi, Mumbai, Pune]

		System.out.println("Descending Order : " + ob2.descendingSet());//Descending Order:[Pune, Mumbai, Delhi, Banglore]

		
		

	}
}
