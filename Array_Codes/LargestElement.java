import java.util.Scanner;

public class LargestElement {
  public static int largest(int[] arr) {

    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (largest < arr[i]) {
        largest = arr[i];
      }
    }
    return largest;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of array : ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the number :");
      arr[i] = sc.nextInt();
    }

    int x = largest(arr);
    System.out.println("Largest Element : " + x);

    sc.close();
  }
}
