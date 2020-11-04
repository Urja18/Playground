#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  if(a+b==c||(a+b)*2==c)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}