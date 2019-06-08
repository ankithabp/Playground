import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int temp=0;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    while(n!=0)
    {
       temp=temp*10;
      temp=temp+n%10;
      n=n/10;
    }
    System.out.println(temp);
  }
}