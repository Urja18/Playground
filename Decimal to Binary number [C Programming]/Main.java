#include<stdio.h>
int dec_to_bin(int n)
{
   //Your code goes here
  long long bin=0;
  int rem,i=1,step=1;
  while(n!=0)
  {
    rem=n%2;
    n=n/2;
    bin+=rem*i;
    i*=10;
  }
  return bin;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
