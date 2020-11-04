// Evaluation of Postfix Expression //

#include<iostream>
#include<string>
#include<stack>
#include<cctype>
using namespace std;


int main() {
	//code
	int t;
	
	cin >> t;

	while(t--){
	    string st;
	    cin >> st;
	    int length = st.length();
	    stack<int> s;
	    s.push(-1);
	    for(int i = 0; i < length; i++)
	    {
	        if(isdigit(st[i]))
	            s.push(st[i]-'0');
	       else{
	           int b = s.top();
	           s.pop();
	           int a = s.top();
	           s.pop();
	       switch(st[i])
	       {
	           case '+':{int c = a + b;s.push(c);break;}
	           case '-':{int c = a - b;s.push(c);break;}
	           case '*':{int c = a * b;s.push(c);break;}
	           case '/':{int c = a / b;s.push(c);break;}
	       }
	    }
	    
	  }
	   cout << s.top() << endl;
	}
	return 0;
}