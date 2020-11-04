#include<iostream>
using namespace std;
int main()
{
 int m,n,req;
std::cin>>m;
std::cin>>n;
std::cin>>req;
if(m*n*req<=50)
{
std::cout<<"Doctor, you can proceed with your experiment.";
}
else
{
std::cout<<"Sorry Doctor! You need more bacteria.";
}
return 0;
}