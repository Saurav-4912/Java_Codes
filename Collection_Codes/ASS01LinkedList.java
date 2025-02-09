package Collection_Codes;

import java.util.LinkedList;

public class ASS01LinkedList {
  public static void main(String[] args) {
		LinkedList<String> L1 = new LinkedList<>(); // Doubly LinkedList
		
		L1.add("RED");
		L1.add("BLUE");
		L1.add("PINK");
		L1.add("ORANGE");
	
		System.out.println(L1);
		
		int i = L1.indexOf("BLUE");
		System.out.println(i);
		
		LinkedList<String> L2 = new LinkedList<>(); // Doubly LinkedList

		L2.add("BlACK");
		L2.add("WHITE");
		
		System.out.println(L2);
		
		L1.addAll(i+1,L2); // Adding L2 in L1
		System.out.println(L1);
		
		L1.addAll(L1.size() , L2);
		System.out.println(L1);

	}
}
