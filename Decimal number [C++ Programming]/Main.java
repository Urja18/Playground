#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    //Your code goes here
  int rem,rev=0,power=1;
    while(n!=0)
    {
        rem=n%8;
        rev=rev+rem*power;
        n/=8;
        power=power*10;
    }
    return rev;

}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
