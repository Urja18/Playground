/*Chocolate piles
Here is an array of pile of chocolates, in every iteration Ayushi chose pile with
maximum number of chocolates,after that square root of chocolate remains and rest
is eaten by Ayushi. After k iterations find number of chocolates remaining. 

Input Format

It consist of 3 lines
first line contain n ( size of pile)
second line contains n space separated integers
third line contains k*/

#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,temp,sum=0;
    cin>>n;
    vector<int> v;
    for(int i=0;i<n;i++)
    {
         cin>>temp;
         sum+=temp;
         v.push_back(temp);
    }
    make_heap(v.begin(),v.end());
    int k,maxi,res;
    cin>>k;
    for(int i=0;i<k && sum > n;i++)
    {
        maxi=v.front();
        sum-=maxi;
        pop_heap(v.begin(), v.end());
        v.pop_back();
        res=sqrt(maxi);
        sum+=res;
        v.push_back(res);
        push_heap(v.begin(),v.end());
    }
    cout<<sum;
}

