package Java_String_Codes;

public class Demo {

  public static int getVal(char ch)
  {
      switch(ch)
      {
          case 'I': return 1;
          case 'V': return 5;
          case 'X': return 10;
          case 'L': return 50;
          case 'C': return 100;
          case 'D': return 500;
          case 'M': return 1000; 
          default : return 0;
      }
  }
public static int romanInt(String s)
{
  int n = s.length();
  int sum=0;
  
  for(int i=0; i<n; i++)   // M C M X C I V
  {
    char ch1 = s.charAt(i);  // M : 1000
    
    if( (i) < n-1 && getVal(ch1) < getVal(s.charAt(i + 1))) {     // 0 < 7-1
      sum = sum - getVal(ch1);
    }
    else {
      sum = sum + getVal(ch1);
    }
  }
  return sum;
}


  public static void main(String[] args) {
    String s = "MCMXCIV";

    int result = romanInt(s);
    System.out.println(result);

  }

}
