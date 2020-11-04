#include<iostream>
using namespace std;
int main()
{
int n = 3,n1,i,j;
std::cin >> n1;
for(i=1;i<=n+1;i++)
{
for(j=1;j<=i;j++)
std::cout<<n1;
n1++;
std::cout<<endl;
}
n1--;
for(i=n+1;i>=1;i--)
{
for(j=1;j<=i;j++)
std::cout<<n1;
n1--;
std::cout<<endl;
}
}