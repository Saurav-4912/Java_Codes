package Char_Patterns;

public class Pattern5 {
  public static void main(String[] args) {
    char l = 'A';
    for(int i = 1 ; i<=5; i++){
      for(int j = 4 ; j>=i ; j--){
        System.out.print(" ");
      }
      for(int k = 1 ; k < i*2;k++){
        System.out.print(l);
      }
      l++;
      System.out.println();
    }
  }
}
