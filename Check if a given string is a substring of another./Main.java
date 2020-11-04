// Check if a given string is a substring of another //

#include <iostream>
#include<stdio.h>
using namespace std;

void testCase();
int main()
{
    int t;
    int l;
    cin>>t;    
    for(l = 0; l < t; l++)
    {
      testCase();
      cout<<"\n";
    }
    return 0;
}
void testCase()
{
    char str[80], search[10];
    int count1 = 0, count2 = 0, i, j, flag;
    scanf("%s %s", str, search);
    while (str[count1] != '\0')
    	count1++;


	while (search[count2] != '\0')
   	    count2++;
    	for (i = 0; i <= count1-count2; i++)
    	{
        for (j = i; j < i + count2; j++)
        {
            flag = 1;
            if (str[j] != search[j - i])
            {
                flag = 0;
                break;
            }
        }       
	  if (flag == 1)
            break;
      }
      if (flag == 1)
        printf("Yes");
      else
        printf("No");
}