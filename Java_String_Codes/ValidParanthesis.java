package Java_String_Codes;

import java.util.Stack;

public class ValidParanthesis {
  public static boolean isValid(String s) {

    // int n = s.length();
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        stack.push(s.charAt(i));
      } else {
      
        char ch = stack.pop();
      if(ch == '' || s.charAt(i)=='}'||s.charAt(i)==']') {
        char ch = stack.pop();
       

      }
    }
    }

    return false;
  }

  public static void main(String[] args) {
    String s = "()[]{}";

    boolean result = isValid(s);
    System.out.println(result);
  }
}
