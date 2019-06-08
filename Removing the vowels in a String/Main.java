import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    String str,r;
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    r=removeVowels(str);
    System.out.print(r);
  }
  public static String removeVowels(String s)
  {
    String finalstring= "";
    int i;
    for(i=0;i<s.length();i++)
    {
      if(!isVowel(Character.toLowerCase(s.charAt(i))))
         {
           finalstring=finalstring+s.charAt(i);
         }
    }
    return finalstring;
  }
    public static boolean isVowel(char c)
    {
      String vowels="aeiou";
      int i;
      for(i=0;i<5;i++)
      {
        if(c==vowels.charAt(i))
        {
          return true;
        }
      }
      return false;
    }
}
