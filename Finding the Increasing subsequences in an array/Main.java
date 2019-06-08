import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int sum_arr[]=new int[3*n];
    increase_arr(n,arr,sum_arr);
  }
  public static void increase_arr(int n,int arr[],int sum_arr[])
  {
    for(int i=0;i<=n-1;i++)
    {
      int key=arr[i];
      for(int j=i;j<=n-1;j++)
      {
        if(arr[j]>key)
          System.out.println(key+","+arr[j]+" ");
      }
    }
  }
}