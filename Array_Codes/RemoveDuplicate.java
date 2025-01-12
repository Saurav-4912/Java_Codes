import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicate {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 1, 4, 3, 1 };

    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < numbers.length; i++) {
      set.add(numbers[i]);
    }

    int size = set.size();
    System.out.println("Size of set : " + size);

    System.out.println("Print set : ");
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }

  }
}
