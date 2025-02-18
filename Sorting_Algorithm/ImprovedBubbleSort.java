
import java.util.Arrays;

/**
 * This class provide an implementation of the Bubble sort algorithm.
 */
public class ImprovedBubbleSort {

  public static void improvedBubbleSort(int[] arr) {

    int n = arr.length;
    int i;

    for (i = n - 1; i > 0; i--) {

      boolean flag = true; // Assuming array is sorted
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          flag = false; // Data found unsorted so contracticting assumption
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      // If no two element were swapped in the inner loop , the array is sorted.
      if (flag == true) {
        break;
      }
    }
    System.out.println("Value of i : " + i);
  }

  public static void main(String[] args) {

    // int[] arr = { 94, 125, 6, 39, 10 };
    // int[] arr = {55,44,33,22,11};
    int[] arr = { 11, 22, 33, 44, 55 };
    System.out.println("Before Sort : " + Arrays.toString(arr));
    ImprovedBubbleSort.improvedBubbleSort(arr);
    System.out.println("After Sort : " + Arrays.toString(arr));
  }
}
