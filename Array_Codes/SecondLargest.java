import java.util.Arrays;

public class SecondLargest {

  public static void getSecondLargest(int[] arr) {
   
  
  Arrays.sort(arr);
  int second = arr[arr.length-2];

 System.out.println(second);


  }

  public static void main(String[] args) {
    int[] arr = { 12, 35, 1, 10, 34, 1 };

    getSecondLargest(arr);
   

  }
}
