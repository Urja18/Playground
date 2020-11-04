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
   for(int i=0;i<n;i++)
   {
     int min_ind=i;
     for(int j=i+1;j<n;j++)
     {
       if(a[j]<a[min_ind])
       {
         int temp = a[j];
         a[j]=a[min_ind];
         a[min_ind]=temp;
       }
     }
   }
     for(int i=0;i<n;i++)
     {
       System.out.print(a[i]+" ");
     }
    
  }
}