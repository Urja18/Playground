#include<iostream>
using namespace std;
int main()
{
  int w;
  int x;
  int y;
  int profit=0;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  profit=(w*x)-(w*y+100);
  std::cout<<profit;
  
  //Type your code here.
}