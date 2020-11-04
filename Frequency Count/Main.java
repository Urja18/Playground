/* Frequency Count
Problem Description: Given a string, find the frequencies 
of each of the characters in it */

#include<iostream>
using namespace std;
string frequencyCount(string str)
{
    int frequency[26] = {0};
    int len = str.length();
    string temp = "";
    for(int i = 0; i < len; i++)
    {
        frequency[str[i] - 'a']++;
    }
    
    for(int i = 0; i < 26; i++)
    {
        if(frequency[i] != 0)
        temp = temp + char('a'+i) + char('0'+frequency[i]);
    }
    return temp;
}
int main()
{
    string str;
    cin >> str;
    cout << frequencyCount(str);
    return 0;
}
