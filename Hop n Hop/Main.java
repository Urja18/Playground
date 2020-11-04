#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  int a=3,b=4;
  int d1=0,d2=0;
  std::cin>>x>>y;
  d1=x-a;
  d2=y-b;
  if(d1>d2)
    std::cout<<d1;
  else
    std::cout<<d2;
  
}