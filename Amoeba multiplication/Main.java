#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int n1=0,n2=1;
  int n3;
  for(int i=2;i<n;++i)
  {
    n3=n1+n2;
    n1=n2;
    n2=n3;
  }
  std::cout<<n3;
}