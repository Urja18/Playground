#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int tb,tr,rs,nb;
  std::cin>>tb>>tr>>rs>>nb;
  float m=tb/6;
  int n=nb/6;
  int p=nb%6;
  float k=((float)n + (float)p/10);
  float d=rs/k;
  float fi=tr/m;
  std::cout<<m<<'\n';
  std::cout<<std::fixed<<std::setprecision(1)<<k<<'\n';
  std::cout<<d<<'\n';
  std::cout<<fi<<'\n';
  if(d>fi)
  
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
  
  
}