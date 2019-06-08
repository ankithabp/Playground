import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int exponent=sc.nextInt();
    System.out.println(power_of_number(base,exponent));
  }
  public static int power_of_number(int b,int e)
  {
    int power=1;
    while(e>=1)
    {
      power=power*b;
      e--;
    }
    return power;
  }
}