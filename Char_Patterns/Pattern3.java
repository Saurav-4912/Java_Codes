package Char_Patterns;

public class Pattern3 {
  public static void main(String[] args) {
    System.out.println("Good Morning");

    for(int i =1 ; i<= 5 ; i++){
      int character=65;
      for(int j = 1 ; j<=i; j++){
        System.out.print((char)character++);
        
      }
      
      System.out.println();
    }
  }
}
