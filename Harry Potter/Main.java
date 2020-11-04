#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d;
  std::cin>>d;
  int l=0;
  int fi=0;
  int s=0;
  l=d%10;
  fi=d/1000;
  
  s=l+fi;
  std::cout<<s;
  
}