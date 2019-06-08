import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if((n>=1) && (n<=5))
        System.out.println("Three");
      else
        System.out.println("Invalid");
	}
}