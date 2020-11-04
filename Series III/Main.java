#include<iostream>
int main()
{
  int n;
  std::cin>>n;
 // int s=5,sum=6;
  int re=6;
  int a=5;
  for(int i=0;i<n;i++)
  {
    re = a*i + re;
    std::cout<<re<<" ";
  }
}