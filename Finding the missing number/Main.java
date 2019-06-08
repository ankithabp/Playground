import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int miss_val=0;
      for(int val=1;val<=arr_size;val++)
      {
        boolean is_found=false;
        for(int idx=0;idx<=arr_size-1;idx++)
        {
          if(arr[idx]==val)
          {
            is_found=true;
            break;
          }
        }
        if(is_found==false){
          miss_val=val;
        break;
      }
    }
  System.out.print(miss_val);
    }
}