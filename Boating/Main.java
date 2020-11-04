#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int cap,a,c;
  int cal=0;
  std::cin>>cap;
  std::cin>>a;
  std::cin>>c;
  cal=(75*a+30*c);
  if(cap>cal)
   std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
    
  
}