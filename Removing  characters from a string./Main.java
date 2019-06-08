import java.util.Scanner;
class Main
{
  public static int[] count_array(String str)
  {
    int count[]=new int[234];
    for(int i=0;i<str.length();i++)
    {
      count[str.charAt(i)]++;
    }
    return count;
  }
  public static String remain_chart(String str,String sub_str)
  {
    int count[]=count_array(sub_str);
    int lp_ind=0,res_ind=0;
    char arr[]=str.toCharArray();
    while(lp_ind!=arr.length)
    {
      char temp=arr[lp_ind];
      if(count[temp]==0)
      {
        arr[res_ind]=arr[lp_ind];
        res_ind++;
      }
      lp_ind++;
    }
    str=new String(arr);
    return str.substring(0,res_ind);
  }
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String sub_str=sc.nextLine();
    System.out.println(remain_chart(str,sub_str));
  }
}