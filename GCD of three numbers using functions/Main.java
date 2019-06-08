import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int result=gcd_of(n1,n2);
      System.out.println(gcd_of(result,n3));
	}
  public static int gcd_of(int num1,int num2)
  {
    int gcd=0,min_no;
    if(num1<num2)
    {
      min_no=num1;
    }
    else
    {
      min_no=num2;
    }
    while(min_no>=1)
    {
      if(num1%min_no==0 && num2%min_no==0)
      {
        gcd=min_no;
        break;
      }
      min_no--;
    }
    return gcd;
  }
}