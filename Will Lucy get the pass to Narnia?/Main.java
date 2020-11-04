#include<iostream>
int main()
{
  int a,b;
  int c;
  std::cout<<"Enter first number : Enter second number : Menu"<<'\n';
  std::cout<<"1.Addition"<<'\n'<<"2.Subtraction"<<'\n'<<"3.Multiplication"<<'\n'<<"4.Division"<<'\n'<<"5.Remainder"<<'\n';
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
 
  switch(c)
  {
    case 1:
      std::cout<<a+b;
      break;
    case 2:
      std::cout<<a-b;
      break;
    case 3:
      std::cout<<a*b;
      break;
    case 4:
      std::cout<<a/b;
      break;
    case 5:
      std::cout<<a%b;
      break;
    default:
      std::cout<<"Invalid operation";
  }
   }