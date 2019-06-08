import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int val=fact(n);
    System.out.print(val);
  }
  public static int fact(int n)
  {
    if(n==0)
      return 1;
    else
      return n*fact(n-1);
  }
}