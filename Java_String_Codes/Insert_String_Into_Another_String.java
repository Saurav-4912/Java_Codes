package Java_String_Codes;

public class Insert_String_Into_Another_String {
  public static void main(String[] args) {
    String str = "GeeksGeeks";
		String str1 = "for";
		int index = 4;
		String s = new String();

		for (int i = 0; i < str.length(); i++) {
			
			s += str.charAt(i);
			if (i == index) {
				s += str1;
			}

		}
		System.out.print(s);
		
		//Time Complexity = O(N)
		//Space Complexity = O(1)
  }
}
