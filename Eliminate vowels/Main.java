import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    String str = sc.next();
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U' )
        continue;
      else
        System.out.print(str.charAt(i));
    }
  }
}