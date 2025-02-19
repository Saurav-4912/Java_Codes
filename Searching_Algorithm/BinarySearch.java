package Searching_Algorithm;

public class BinarySearch {
  public static int binarySearch(int[] arr, int target) {

		if (arr == null)
			return -1;
		int n = arr.length;
		int lb = 0;
		int ub = n - 1;
		int mid = -1;

		while (lb <= ub) 
		{
			mid = (lb + ub) / 2;
			if (target == arr[mid])
			{
				return mid;
			} 
			else if (target < arr[mid])
			{
				ub = mid - 1;
			} 
			else {
				lb = mid + 1;
			}
		}
		return -(lb + 1);
	}

  public static void main(String[] args) {
    int[] arr = { 11, 22, 33, 44, 55 };
		

		//int index = Arrays.binarySearch(arr , 48);  // -5
		int index = binarySearch(arr, 48);     // -5
		
		System.out.println(index);

		if (index < 0) {
			System.out.println("NOT FOUND");
		} else {
			System.out.println("FOUND");
		}
  }
}
