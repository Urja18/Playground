#include<stdio.h>
int dec_to_bin(int n)
{
   //Your code goes here
  
  return (int)log2(n)+1;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
