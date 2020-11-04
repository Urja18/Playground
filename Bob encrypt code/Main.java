import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int S =sc.nextInt();
    int N =sc.nextInt();
    int M =sc.nextInt();
    
    int x,y,z;
    x=((int)Math.pow(S,N))%10;
    y=((int)Math.pow(x,M))%1000000007;
    
    
    
    
    System.out.println(y);
  }
}