import java.util.*;

class Main
{

public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
    int r,star,sp,n;
	n=sc.nextInt();
	for(r=n;r>=2;r--)
	{
		for(sp=1;sp<=n-r;sp++)
			System.out.printf(" ");
		for(star=1;star<=2*r-1;star++)
			System.out.printf("*");
		System.out.printf("\n");
	}
	for(r=1;r<=n;r++)
	{
		for(sp=1;sp<=n-r;sp++)
			System.out.printf(" ");
		for(star=1;star<=2*r-1;star++)
			System.out.printf("*"); 
		System.out.printf("\n");
	}
    
}
}