import java.util.Scanner;
public class Main {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int freq[] = new int[256];
		int max=-1;
		char c=' ';
		for(int i=0;i<s.length();i++)
			freq[s.charAt(i)]++;
		for(int i=0;i<s.length();i++)
		{
			if(max<freq[s.charAt(i)])
			{
				max=freq[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println(c);
		sc.close();
	}

}
