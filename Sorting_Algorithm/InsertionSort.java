

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		int j;
		for( int i =1 ; i<n; i++)
		{
			int temp = arr[i];
			for( j = i-1; j>=0 ; j--) 
			{
				if(arr[j]>temp) 
				{
					 arr[j+1] = arr[j];
				}
				else
			    {
					break;
				}
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		

		int[] arr = {12,32,43,23,34,21};
		
		System.out.println("Before Sort : " + Arrays.toString(arr));
		
		InsertionSort.insertionSort(arr);
		
		System.out.println("After Sort : " + Arrays.toString(arr));
	}

}
