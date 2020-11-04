#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  int c=0;
  std::cin>>n;
  std::cout<<n<<"\n";
  while(n!=1)
  {
  if(n%2==0)
  {
    n=n/2;
    std::cout<<n<<"\n";
    c++;
    }
  else{
    n=3*n+1;
  std::cout<<n<<"\n";
  c++;
}}
  std::cout<<c;
}