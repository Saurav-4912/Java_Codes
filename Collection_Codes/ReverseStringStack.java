package Collection_Codes;

import java.util.Stack;

public class ReverseStringStack {
  
	public static void main(String[] args) {

		String s = "India is my country";
		
		String str[] = s.split(" ");
		
		Stack<String> stack = new Stack<>();
		for(int i = 0 ; i<str.length ; i++) {
			//stack.add(str[i]); // add function is work but it is bad practice
			stack.push(str[i]);
		}
		
		System.out.println(stack);
		
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
