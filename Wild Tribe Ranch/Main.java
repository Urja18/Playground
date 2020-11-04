#include<iostream>
int main()
{
  int mw,w;
  std::cin>>mw;
  std::cin>>w;
  if(mw<w)
    std::cout<<"Sorry, you can't enter";
  else if(mw==w)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Yes, you can enter.";
}