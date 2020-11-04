import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int mat[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j =0;j<col;j++)
      {
        mat[i][j]=sc.nextInt();
      }
    }
    int i,j;
    int max;
	for(i=0;i<row;i++) {
		max = 0;
		for(j=0;j<col;j++)
		{
			if(max<mat[i][j])
				max = mat[i][j];
		}
		System.out.print(max+" ");
    
  }
}
}