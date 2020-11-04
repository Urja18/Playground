#include<iostream>
using namespace std;
int nhandshake(int n)
{
  return (n*(n-1))/2;
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<nhandshake(n);
  return 0;
}