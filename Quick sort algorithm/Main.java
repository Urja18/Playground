import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
     for(int k=0;k<n;k++){
    for(int i=0;i<n-1;i++)
    {
      if(a[i]>a[i+1])
      {
        int temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
      }
    }
    }
     for(int i=0;i<n;i++)
     {
       System.out.print(a[i]+" ");
     }
    
  }
}