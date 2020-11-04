#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int items;
  double ht;
  double tht;
  std::cin>>items>>ht;
  if(items==1)
  { tht=ht;
    std::cout<<tht;
  }
  else if(items==2)
  {
    tht=ht+(ht*0.5);
    std::cout<<tht;
  }
  else if(items==3)
  {
    tht=2*ht;
    std::cout<<tht;
  }
    else
      std::cout<<"Number of items is more";
    
}