public class RemoveElement {
  public static void main(String[] args) {
    int[] arr = {0,1,2,2,3,0,4,2};
    int val = 2;

    int k = 0 ;
    for(int i =0 ; i<arr.length ; i++){
      if(arr[i] != val){
        arr[k] = arr[i];
        k++;
      }
    }
    System.out.println(k);
  }
}
