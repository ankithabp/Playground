import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      switch(n)
      {
        case 7:
          int sum=n+n+n+n;
      System.out.println(sum);
          break;
        case 8:
          int s2=n+n+n+n+4;
          System.out.println(s2);
          break;
      }
	}
}