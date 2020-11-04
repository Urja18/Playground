#include<stdio.h>
int dec_to_oct(int n)
{
    //Your code goes here
  int rem,rev=0;
  int power=1;
  while(n!=0)
  {
    rem=n%8;
    rev=rev+rem*power;
    n=n/8;
    power=power*10;
  }
  return rev;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
