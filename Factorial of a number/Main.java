#include<iostream>
int main(){
  // Type your code here
  int n;
  int fact=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
   // std::cout<<fact;
  }  
 std::cout<<fact;
}