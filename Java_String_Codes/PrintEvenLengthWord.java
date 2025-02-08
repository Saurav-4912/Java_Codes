package Java_String_Codes;

public class PrintEvenLengthWord {
  public static void main(String[] args) {
    String str = "This is a java language";
		
		String s[] = str.split(" ");
		
		for(int i =0 ; i < s.length ; i++) {
			if(s[i].length() % 2 ==0) {
				System.out.print(s[i]+ " ");
				
			}
		}
  }
}
