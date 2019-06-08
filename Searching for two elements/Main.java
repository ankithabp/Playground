import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int search_elem1=sc.nextInt();
      int search_elem2=sc.nextInt();
      int elem_1=-1;
      int elem_2=-1;
      for(int i=0;i<=arr_size-1;i++)
      {
        if(search_elem1==arr[i])
        {
          elem_1=i;
        }
        if(search_elem2==arr[i])
        {
          elem_2=i;
        }
      }
      System.out.println(elem_1);
      System.out.println(elem_2);
    }
}