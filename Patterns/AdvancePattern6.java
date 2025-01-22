public class AdvancePattern6 {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      System.out.print(" *");
      for (int k = 5; k > i * 2; k--) {
        System.out.print(" ");
      }
      if (i < 3) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
