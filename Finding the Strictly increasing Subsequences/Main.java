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
      int flag=1;
      for(int j=i+1;j<=n-1;j++)
      {
        if(arr[j]>key)
        {
          for(int k=i;k<=j;k++)
          {
            if(arr[k]>arr[j])
              flag=0;
          }
          if(flag==1)
            System.out.println(key+","+arr[j]+" ");
        }
        flag=1;
      }
    }
  }
}