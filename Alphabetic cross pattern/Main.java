import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    String x = sc.next();
    int n=x.length();
    char s[]=x.toCharArray();
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i==j || i+j==n-1)
        	System.out.print(s[j]);
        else
          	System.out.print(" ");
      }
      System.out.println();
    }
  }
}