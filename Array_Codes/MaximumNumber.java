import java.util.Scanner;

class MaximumNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array : ");
    int length = sc.nextInt();

    int[] numbers = new int[length];

    System.out.println("Enter the number :");
    for (int i = 0; i < numbers.length; i++) {
      int num = sc.nextInt();
      numbers[i] = num;
    }

  
    System.out.println("Print array : ");
    for (int j = 0; j < numbers.length; j++) {
      System.out.print(numbers[j] + " ");
    }
    System.out.println();

    System.out.println("Print Maximum Number : ");
    int maxNumber = numbers[0];

    for (int k = 0; k < numbers.length; k++) {
      if (numbers[k] > maxNumber) {
        maxNumber = numbers[k];
      }
    }
    System.out.println(maxNumber);
    sc.close();

  }
}