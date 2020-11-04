#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fsc,sa,sd,ssc,aa,ad,asc;
  int fbill=0;
  int sbill=0;
  int abill=0;
  std::cin>>fa>>fd>>fsc>>sa>>sd>>ssc>>aa>>ad>>asc;
  fbill=(fa-(fa*(fd*0.01))+fsc);
  sbill=(sa-(sa*(sd*0.01))+ssc);
  abill=(aa-(aa*(ad*0.01))+asc);
  std::cout<<"In Flipkart Rs."<<fbill<<'\n';
  std::cout<<"In Snapdeal Rs."<<sbill<<'\n';
  std::cout<<"In Amazon Rs."<<abill<<'\n';
  if(fbill<=sbill && fbill<abill)
  std::cout<<"He will prefer Flipkart";
  else if(sbill<fbill && sbill<abill)
  std::cout<<"He will prefer Snapdeal";
  else if(abill<fbill && abill<sbill)
  std::cout<<"He will prefer Amazon";
  
  
}