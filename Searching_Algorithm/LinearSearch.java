package Searching_Algorithm;

public class LinearSearch {

  public static int linearSearch(int arr[] , int key) {

    if (arr == null) {
			return -1;
		}
    int n = arr.length;
    for(int i =0 ; i<n ; i++){
      if(key == arr[i]){
        return i;
      }
      if(key < arr[i]){
        break;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 11, 22, 33, 44, 55 };
    int key = 55;
    int index = linearSearch(arr, key);
    if (index == -1) {
      System.out.println("No Element Found : " + key);
    } else {
      System.out.println("key " + key + " found at index :" + index);
    }
  }
}
