import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      subset_of(n,arr);
    }
  public static void subset_of(int n,int arr[])
  {
    for(int i=0;i<=n-2;i++)
    {
      for(int j=i+1;j<n-1;j++)
      {
        for(int k=j+1;k<=n-1;k++)
        {
          System.out.print("(" + arr[i] + "," + " " + arr[j] + "," + " " + arr[k] + ")" + " ");
        }
      }
      System.out.println();
    }
  }
}