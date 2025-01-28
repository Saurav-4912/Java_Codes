package Char_Patterns;

public class Pattern4 {
  public static void main(String[] args) {
    char l = 'A';
    for(int i=1 ; i<= 5 ; i++){
      for(int j = 5 ; j>=i; j--){
        System.out.print(" ");
      }
      for(int k = 1; k<=i;k++){

        System.out.print(l);
        
      }
      l++;
      System.out.println();
    }
  }
}
