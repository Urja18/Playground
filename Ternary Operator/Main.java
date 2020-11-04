#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  std::cin>>num;
  int res=(int)(num%2==0?0:1);
  if(res==0)
  
    std::cout<<"Even";
    else
      std::cout<<"Odd";

}