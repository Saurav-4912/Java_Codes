public class ReverseArray {
  public static void main(String[] args) {
    int[] numbers = { 35, 33, 42, 10, 14, 19, 27, 44, 26, 31 };

    ReverseArray.reverseArray(numbers);

  }

  public static void reverseArray(int[] numbers) {

    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.print(numbers[i] + " ");
    }

  }
}
