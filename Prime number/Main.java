
import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a, b, i, j, flag; 
        b=sc.nextInt();
        for (i = 2; i <= b; i++) 
        { 
            
            flag = 1; 
            for (j = 2; j <= i / 2; ++j) 
            { 
                if (i % j == 0) 
                {  
                    flag = 0; 
                    break; 
                } 
            } 
            if (flag == 1)
                System.out.print(i+" ");
        } 
	}
}
