// public class NumberPattern7 {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 5; i++) {
//       for (int j = i; j >= 1; j--) {
//         if (j % 2 == 0) {
//           System.out.print(0);
//         } else {
//           System.out.print(1);
//         }
//       }
//       System.out.println();
//     }
//   }
// }

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print 1 if the sum of i and j is even, otherwise print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
