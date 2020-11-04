#include<iostream>
#include<cmath>
int main()
{
  int n;
  std::cin>>n;
  double a=0.5;
  for(int i=0;i<n;i++)
  {
    if(i==0){
      std::cout<<a;
    continue;}
    else
    {
      double t=pow(3,i-1);
       double x=t+a;
    a=x;
    std::cout<<" "<<x;
  }
  }
    
}