#include<stdio.h>
int bin_to_dec(int n)
{
    //Your code goes here
  int num=n;
  int dec_value=0;
  int base=1;
  int temp = num;
  while(temp)
  {
    int ld=temp%10;
    temp=temp/10;
    dec_value+=ld*base;
    base=base*2;
  }
  return dec_value;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}