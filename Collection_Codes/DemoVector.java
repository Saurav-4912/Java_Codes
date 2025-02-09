package Collection_Codes;

import java.util.*;

public class DemoVector {
  public static void main(String[] args) {
		
		Vector<String> ob = new Vector<>(2,3);
//Vector<String> ob = new Vector<>();
//Constructs an empty vector so that its internal data array has size 10 and its standard capacity increment is zero.
// Vector is synchronized.
		
		ob.add("AAA");
		ob.add("BBB");
		ob.add("CCC");
		
		System.out.println(ob);
		System.out.println(ob.size());
		System.out.println(ob.capacity());
		
		ob.add("DDD");
		ob.add("EEE");
		ob.add("FFF");
		
		System.out.println(ob);
		System.out.println(ob.size());
		System.out.println(ob.capacity());
		
		
		// Using for-each loop
		for (String data : ob) {

			System.out.print(data + " ");

		}
		
		System.out.println();
		
		// Using Iterator 
		Iterator<String> ir = ob.iterator();

		while (ir.hasNext()) {
			System.out.print(ir.next() + " ");
		}
		
		
		/*
		Vector<String> v = new Vector<>();
		
		System.out.println(v.size());   // 0
		System.out.println(v.capacity());  // 10

          */

	}
}


