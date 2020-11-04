#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  double famt=0.0;
  int si=0;
  int amt=0;
  double di=0.0;
  
  std::cin>>p>>t>>r;
  si=(p*t*r)/100;
  amt=p+si;
  di=si*0.02;
  famt=amt-di;
  std::cout<<si<<'\n';
  std::cout<<amt<<'\n';
  std::cout<<di<<'\n';
  std::cout<<famt<<'\n';
  
  
}