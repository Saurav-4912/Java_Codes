package LeetcodeProblem;
public class Q1 {

  public static int[] twoSum(int[] nums , int target){

    // Attempt - 1
    int[] a = {0,0};

    for(int i = 0 ; i<nums.length ; i++){
      for(int j = i+1 ; j<nums.length ; j++){
        if(nums[i]+nums[j] == target){
          a[0] = i;
          a[1]=j;
          return a;
        }
      }
    }
    return a;
  }

  public static int[] twoSumm(int[] nums , int target){
    for(int i = 1 ; i<nums.length;i++){
      for(int j =i; j<nums.length;j++){
        if(nums[j-i]+nums[j]==target)
          return new int[] {j-i,j}; // Return indices when target is met
        
      }
    }
    // Return empty array if no solution found
    return new int[]{};
  }
  public static void main(String[] args) {
    int[] nums = {3,2,4};
    int target = 6;

    //int[] result = twoSum(nums, target);
    int[] result = twoSumm(nums, target);
    System.out.println("["+ result[0] + " , "+ result[1] + "]");
  }
 


}
