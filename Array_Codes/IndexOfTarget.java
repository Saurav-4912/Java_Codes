import java.util.Scanner;

public class IndexOfTarget {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int number = sc.nextInt();

    int[] numbers = {14,25,12,53,2,102,72,97};
    int result = IndexOfTarget.targetElement(number, numbers);
    if(result != -1){
      System.out.println("Index of target : "+  result);
    }else{
      System.out.println(result);
    }

    sc.close();
  }

  public static int targetElement(int number , int[] numbers){

    for(int i = 0 ; i < numbers.length ; i++){
      if(number == numbers[i]){
        return i;
      }
    }
    return -1;
  }
  
}
