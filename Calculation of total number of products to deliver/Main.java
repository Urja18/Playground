import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    
    for(int i=0;i<n;i++){
      int sum=0;
      int tem=a[i];
      while(tem!=0){
        int r=tem%10;
        sum+=r;
        tem=tem/10;}
    System.out.print(sum+" ");
    }
  }
}