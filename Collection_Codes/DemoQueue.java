package Collection_Codes;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  
	public static void main(String[] args) {

		Queue<String> ob = new LinkedList<>();
		// Queue work with LinkedList because add and delete operation are fast O(1).
		
		ob.add("AAA");
		ob.add("BBB");
		ob.add("CCC");
		ob.add("DDD");
		
		System.out.println(ob);
		
		while(!ob.isEmpty())  // ob is not empty.
		{
			System.out.print("DATA :" + ob.remove());
		}
		System.out.println(ob);
	}
}
