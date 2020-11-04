import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Main m = new Main();
    String s=sc.next();
    int n=s.length();
    int i;
    for(i=0;i<n;i++){
      if(m.checkP(s,i,n-1))
        break;
    }
    System.out.println(i);
  }
  boolean checkP(String s , int i,int j){
   while(i<j){
     if(s.charAt(i)!=s.charAt(j))
       return false;
     i++;
     j--;
   }
   return true;
 }
}