public class CheckArraySort {

  public static boolean checkSorted(int[] arr){

    int prev=0;
    for(int i = 1 ; i < arr.length ; i++){
      if(arr[prev] > arr[i]){
        return false;
      }
      }
    
    return true;
  }
  public static void main(String[] args) {
    int[] arr={11,22,33,88,55};

    boolean status = checkSorted(arr);
    if(status){
      System.out.println("Array is sorted.");
    }else{
      System.out.println("Array not sorted.");
    }
  }
}
