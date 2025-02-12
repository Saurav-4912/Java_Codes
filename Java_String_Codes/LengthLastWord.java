package Java_String_Codes;

public class LengthLastWord {
  public static int lengthOfLastWord(String s) {
		
		String str[] = s.split(" ");
		
		String strr = str[str.length-1];
		
		int k =0;
		for(int i = 0 ; i < strr.length(); i++) {
			k++;
		}
		
		return k ;
	}
  public static void main(String[] args) {
    String s = "   fly me   to   the moon  ";
		
		int status = lengthOfLastWord(s);
		System.out.println("The lenght of last word is : " + status);
  }
}
