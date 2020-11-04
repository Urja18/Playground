import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      int t =arr[i];
      int sum=0;
      while(t!=0)
      {
        int rem =t%10;
        sum=sum+rem;
        t=t/10;
        //sum=0;
      }
      System.out.print(sum+" ");
    }
  }
}