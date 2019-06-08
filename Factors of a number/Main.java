import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      for(int factor=1;factor<=num;factor++)
      {
        if(num%factor==0)
          System.out.println(factor);
      }
	}
}