import java.util.*;

class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int count=0;
    int i=0;
    int y =x;
    while(y!=0){
      count++;
      y=y/10;
    }
    int a[]=new int[count];
    while(x!=0){
      a[i++]=x%10;
      x=x/10;
    }
    Arrays.sort(a);
    for(i=0;i<count;i++){
      System.out.print(a[i]+" ");
    }
    
  }
}