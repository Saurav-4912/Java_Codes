import java.util.*;

public class ReverseList {
  public static List<Integer> reverseArrayList(List<Integer> L){
    List<Integer> TL = new ArrayList<>();

    for(int i = L.size()-1; i>=0 ; i--){
      TL.add(L.get(i));
    }
    return TL;
  }
  public static void main(String[] args) {
    List<Integer> L = new ArrayList<>(Arrays.asList(11,22,33,44,55));

    List<Integer> T = reverseArrayList(L);
    for(Integer data : T){
      System.out.print(data + " ");
    }


  }
}
