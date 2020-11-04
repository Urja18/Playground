#include<stdio.h>
int pattern(int n)
{
   //Your code goes here
  for(int i=1;i<=n;i++)
  {
  for(int j=1;j<=n;j++)
  {
    if(i==1 || i==n || j==1 || j==n)
    
    printf("1");
    else
    printf(" ");
    
  }
    printf("\n");
  }
}
void main()
{
    int n;
    scanf("%d",&n);
    pattern(n);
}
