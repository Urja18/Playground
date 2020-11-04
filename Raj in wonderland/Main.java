#include<iostream>
int main()
{
  int a;
  std::cin>>a;
  int res=(int)(a%2==0?0:1);
  if(res==0)
  std::cout<<"Possible";
  else
    std::cout<<"Not possible";
}