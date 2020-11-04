import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = sc.nextInt();
    char [] c=s.toCharArray();
    int l=c.length;
    char k=c[n-1];
    for(int i=0;i<l;i++){
      c[i]=k;
    }
   /*	for(int i=0;i<l;i++){
    System.out.print(c[i]);
    }*/
    String str = new String(c);
    System.out.print(str);
    
  }
}