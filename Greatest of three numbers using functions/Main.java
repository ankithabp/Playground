import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int results=gcd_of(n1,n2);
      System.out.println(gcd_of(results,n3));
	}
  public static int gcd_of(int num1,int num2)
  {
    int max_no=0;
    if(num1>num2)
    {
      max_no=num1;
    }
    else
    {
      max_no=num2;
    }
    return max_no;
  }
}