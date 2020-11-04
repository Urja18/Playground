// Binary palindrome
//Write a program to check whether it’s a
// binary palindrome or not.

#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int n1=0;
    int temp=n;
    while(n>0)
    {
        n1<<=1;
        n1|=(n&1);
        n>>=1;
    }
    if(temp == n1)
        cout<<"Yes";
    else
        cout<<"No";
  return 0;
}
