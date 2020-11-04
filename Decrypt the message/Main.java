#include<iostream>
int main()
{
  int n1,n2;
  int re=0;
  std::cin>>n1;
  std::cin>>n2;
  int n=n1+n2;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
      re=re+i;
  }
  if(re==n)
    std::cout<<"They can read the message";
 else
   std::cout<<"They can't read the message";
  
}