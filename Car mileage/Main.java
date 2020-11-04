#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,l,d;
  int mcal=0;
    std::cin>>m;
    std::cin>>l;
  std::cin>>d;
  mcal=d/l;
  if(m>mcal)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
  
}