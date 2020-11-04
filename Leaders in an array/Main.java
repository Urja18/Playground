#include<iostream>
#include<vector>
#define ll long long
using namespace std;
int main()
 {
	int t;
	cin>>t;
	while(t--){
	    int i,n,len;
	    cin>>n;
	    int a[n];
	    for(i=0;i<n;i++)
	        cin>>a[i];
	   vector<int>st;
	   st.push_back(a[n-1]);
	    for(i=n-2;i>=0;i--){
	        if(a[i]>=st.back())
	            st.push_back(a[i]);
	    }
	    len=st.size();
	    for(i=len-1;i>=0;i--){
	        cout<<st[i]<<" ";
	    }
	    cout<<endl;
	}
	return 0;
}