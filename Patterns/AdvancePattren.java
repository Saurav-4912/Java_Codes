public class AdvancePattren {
  public static void main(String[] args) {
    for(int i = 1 ; i< 5 ; i++)
    {
      for(int j = 1 ; j <= i ; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int k = 1 ; k < 4 ; k++){
      for( int s = 3 ; s >=k; s--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
