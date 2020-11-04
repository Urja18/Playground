#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,py;
  std::cin>>by>>py;
  if(by>py)
  {
    int x=1900+by;
    int y=2000+py;
    std::cout<<y-x;
  }
  else
  {
    int x=2000+by;
    int y=2000+py;
    std::cout<<y-x;
 
  }
}