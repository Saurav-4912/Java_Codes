import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

  public static int[] convertListToArray(List<Integer> L){

    int[] a = new int[L.size()];

    int i =0;
    for(Integer data : L){
      a[i] = data;
      i++;
    }
    return a;
  }

  public static void main(String[] args) {
    List<Integer> L = new ArrayList<>(Arrays.asList(11,22,33,44));

    int[] arr = convertListToArray(L);
    for(int i = 0 ; i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    
  }
}
