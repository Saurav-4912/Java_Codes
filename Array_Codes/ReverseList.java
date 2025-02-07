import java.util.*;

public class ReverseList {

  // Attempt 1
  public static List<Integer> reverseArrayList(List<Integer> L){
    List<Integer> TL = new ArrayList<>();

    for(int i = L.size()-1; i>=0 ; i--){
      TL.add(L.get(i));
    }
    return TL;
  }

  // Attempt 2
public static List<Integer> reverseL(List<Integer> L){

  for(int i =0 , j=L.size()-1 ; i < j ; i++ , j--){
    Integer temp = L.get(i);
    L.set(i,L.get(j));
    L.set(j,temp);
  }

  return L;
}


  public static void main(String[] args) {
    List<Integer> L = new ArrayList<>(Arrays.asList(11,22,33,44,55));

    System.out.println("Using First Attempt : ");
    List<Integer> T = reverseArrayList(L);
    for(Integer data : T){
      System.out.print(data + " ");
    }
System.out.println();

    System.out.println("Using Second Attempt : ");
     reverseL(L);
     for(Integer data : L){
      System.out.print(data + " ");
    }


  }
}
