/* Dirty Characters
  Sample Input:  “Dennis Ritchie” “RPD”
  (Both the input strings should be in between double quotes).
 Sample Output: ennis itchie                      */

#include<bits/stdc++.h>
using namespace std;
int main()
{
	string str, mask;
	getline(cin,str); //input from commandline
	getline(cin,mask); //input from commandline
	int strascii[128]={0},i;
	for(i=0;i<str.size();i++)
		strascii[str[i]]++;
	for(i=0;i<mask.size();i++)
		strascii[mask[i]]=0;
	mask="";
	for(i=0;i<str.size();i++)
		if(strascii[str[i]])
			mask.push_back(str[i]);
	cout<<mask;
}