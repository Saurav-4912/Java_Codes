public class CountEven {
  public static void main(String[] args) {
    int[] numbers = {35,33,42,10,14,19,27,44,26,31};
System.out.println("Print Array :");
for(int j =0 ; j<numbers.length ; j++){
  System.out.print(numbers[j] + " ");
}
System.out.println();
    int count = 0;
    for(int i = 0 ; i < numbers.length ; i++){
      if(numbers[i] %2 == 0){
        count++;
      }
    }
    System.out.println("Total even number : " + count);
  }
}
