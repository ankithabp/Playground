import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int length=s.length();
    double afdec=0;
    double bedec=0;
    int flag=0;
    for(int i=0;i<length;i++)
    {
      if(s.charAt(i)=='.')
        flag=1;
    }
    if(flag==1)
    {
      for(int i=length-1;s.charAt(i)!='.' && i>=0;i--)
      {
        afdec=afdec/10+(s.charAt(i)-'0');
      }
      afdec=afdec/10;
    for(int i=0;s.charAt(i)!='.';i++)
    {
      bedec=bedec*10+(s.charAt(i)-'0');
    }
    }
    else
    {
      for(int i=0;i<length;i++)
      {
        bedec=bedec*10+(s.charAt(i)-'0');
      }
    }
    double sum=(afdec+bedec);
    System.out.printf("%.6f",sum);
  }
}