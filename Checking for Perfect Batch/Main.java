import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int list[]=new int[n];
    for(int index=0;index<n;index++)
    {
       list[index]=sc.nextInt();
    }
    sem_elem(list,n);
  }
  public static void sem_elem(int list[],int n)
  {
    boolean is_matched=true;
    int batch_no=list[0]+list[1]+list[2];
    for(int index=3;index<=(n-1);index=index+3)
    {
      int cur_batch=list[index]+list[index+1]+list[index+2];
    if(cur_batch!=batch_no)
    {
      is_matched=false;
    }
    }
    if(is_matched==true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}