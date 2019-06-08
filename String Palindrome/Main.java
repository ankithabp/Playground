import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      int str1_len=str1.length();
      int end=str1_len-1;
      int front=0;
        boolean pallindrome_matched=true;
      while(front<end)
      {
          if(str1.charAt(front)!=str1.charAt(end))
          {
            pallindrome_matched=false;
            break;
          }
        front++;
        end--;
      }
        if(pallindrome_matched==true)
        {
          System.out.println("Yes");
        }
        else
        {
          System.out.println("No");
        }
      }
    }