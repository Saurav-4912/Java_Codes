package Collection_Codes;

import java.util.*;

public class DemoLinkedList {
  public static void main(String[] args) {
    	// ArrayList<String> ob = new ArrayList<>();
		LinkedList<String> ob = new LinkedList<>();

		ob.add("saurav");
		ob.add("Pratik");
		ob.add("Vedant");
		ob.add("Akash");
		ob.add("Omkar");

		// ob.add(22); // We can't add bcoz we can store only string.

		// ob.remove(2); // remove index of element.
		// System.out.println(ob.size()); // print size of arraylist.
		// System.out.println(ob);

		// Traverse ArrayList Using for-each loop

		for (String data : ob) {

			System.out.print(data + " ");

		}

		System.out.println();

		// Traverse ArrayList using Iterator
		Iterator<String> ir = ob.iterator();

		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		ob.clear(); // remove all from list
		System.out.println(ob);

  }
}
