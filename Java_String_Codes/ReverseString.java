package Java_String_Codes;

public class ReverseString {
  public static void main(String[] args) {
    //Attempt -1
		/*
		String str = "saurav";
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);
		*/
		
		// Attempt - 2
		String str = "javapoint";
		char ch[] = str.toCharArray();
		for(int i = 0 , j = ch.length-1 ; i<j; i++ , j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		
		String s = new String(ch);
		System.out.println(s);
  }
}
