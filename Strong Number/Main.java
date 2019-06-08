import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int sum=0;
      int c_num=num;
      while(num>0)
      {
        int rem=num%10;
        int fact=1;
        for(int count=1;count<=rem;count++)
        {
          fact=fact*count;
        }
        sum=sum+fact;
        num=num/10;
      }
        if(sum==c_num)
          System.out.println("Yes");
        else
        {
          System.out.println("No");
        }
	}
}