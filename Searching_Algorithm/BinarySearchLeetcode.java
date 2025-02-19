package Searching_Algorithm;

public class BinarySearchLeetcode {
  public static int searchInsert(int[] nums, int target) {
    if (nums == null)
      return -1;

    int n = nums.length;
    int lb = 0;
    int ub = n - 1;
    int mid = -1;

    while (lb <= ub) {
      mid = (lb + ub) / 2;
      if (target == nums[mid]) {
        return mid;
      } else if (target < nums[mid]) {
        ub = mid - 1;
      } else {
        lb = mid + 1;
      }
    }

    return lb;

  }

  public static void main(String[] args) {
      int[] nums = {2,4,6,7,9};

      int index = BinarySearchLeetcode.searchInsert(nums, 5);

      System.out.println(index);
    }
}
