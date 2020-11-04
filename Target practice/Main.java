#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int target;
  int hitsum=0;
  int score;
  int count=0;
  std::cin>>target;
  while(hitsum<target){
    std::cin>>score;
    hitsum=hitsum+score;
    count++;
  }
    if(hitsum==target || hitsum>target)
    std::cout<<"The number of turns is "<<count;
  
}