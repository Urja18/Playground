#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u;
  int bill=0;
  std::cin>>u;
  if(u<=200)
    bill=0.5*u;
  else if(u>200 && u<=400)
    bill=(0.65*u)+100;
  else if(u>400 && u<=600)
     bill=(0.80*u)+200;
  else if(u>600)
    bill=(u*1.25)+425;
  std::cout<<"Rs."<<bill;
}