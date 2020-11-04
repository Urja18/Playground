#include<iostream>
using namespace std;
int main()
{
  int n;
  int j=0;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    if((n%i)==0)
      j++;
    }
  switch(j){
    case 2:
  std::cout<<"Eligible";
  break;
     default:    
    std::cout<<"Not eligible";
  break;
}}