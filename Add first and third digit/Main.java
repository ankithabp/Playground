import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int add=0;
      add=(n/100)+(n%10);
      System.out.println(add);
	}
}