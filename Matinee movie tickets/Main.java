#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  double timing;
  double price;
  std::cin>>age>>timing;
  if(timing>12.00 && age >13)
  {
    std::cout <<"$"<<"5.00";
  }
  else if(timing<12.00 && age >13)
  {
    std::cout <<"$"<<"8.00";
  }
   else if(timing<12.00 && age <13)
  {
    std::cout <<"$"<<"4.00";
  }
   else if(timing>12.00 && age <13)
  {
    std::cout <<"$"<<"2.00";
  }
  
}