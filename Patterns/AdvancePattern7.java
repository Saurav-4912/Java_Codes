public class AdvancePattern7 {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      for (int j = 4; j >= i; j--) {
        System.out.print(" ");
      }
      System.out.print("*");

      System.out.println();
    }
    for (int i = 0; i < 4; i++) {
      for (int l = 0; l <= i; l++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
  }
}
