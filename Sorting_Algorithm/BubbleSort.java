package Sorting_Algorithm;

import java.sql.Array;
import java.util.Arrays;

public class BubbleSort {
  public static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = n - 1; i > 0; i--) 
    {
      for (int j = 0; j < i; j++)
       {
        if (arr[j] > arr[j + 1])
         {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

  }

  public static void main(String[] args) {
     int[] arr = { 94, 125, 6, 39, 10 };
    // int[] arr = {55,44,33,22,11};
    //int[] arr = { 11, 22, 33, 44, 55 };
    System.out.println("Before Sort : " + Arrays.toString(arr));
    BubbleSort.bubbleSort(arr);
    System.out.println("After Sort : " + Arrays.toString(arr));
  }
}
