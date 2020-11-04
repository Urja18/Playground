import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
   String str = sc.next();
    String rev="";
    int len = str.length();
    for(int i=len-1;i>=0;i--)
    {
      rev=rev+(str.charAt(i));
    }
    if(str.equals(rev))
    {
      System.out.println(str+" is a palindrome");
    }
    else
    {
      System.out.println(str+" is not a palindrome");
    }
  }
}