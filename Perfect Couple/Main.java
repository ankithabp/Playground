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
      int value=sc.nextInt();
      perfect_couple(n,arr,value);
    }
  public static void perfect_couple(int n,int arr[],int value)
  {
    for(int i=0;i<=n-1;i++)
    {
      for(int j=i+1;j<=n-1;j++)
      {
        int sum=arr[i]+arr[j];
        if(sum==value)
        {
          System.out.println(arr[i] + "," + " " + arr[j]);
        }
      }
    }
  }
} 