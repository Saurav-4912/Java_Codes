public class FindDuplicate {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 1, 4, 3, 1 };

    boolean status = FindDuplicate.duplicate(numbers);
    if (status) {
      System.out.println("Duplicate element found");
    } else {
      System.out.println("Given array does not contain duplicate element");
    }
  }

  public static boolean duplicate(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          return true;
        }
      }
    }
    return false;
  }
}
