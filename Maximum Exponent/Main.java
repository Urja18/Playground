#include <iostream>
using namespace std;

int countExp(int i){
    int count=0;
    while((i%2==0) && (i!=0)){
        count+=1;
        i=i/2;
    }
    return count;
}

int maxExp(int a, int b){
    int max = -1,num=0,temp;
    for(int i=a;i<=b ;i++){
        temp=countExp(i);
        if(temp>max){
            max=temp;
            num=i;
        }
    }
    return num;
}

int main() {
	int a,b;
	cin>>a;
	cin>>b;
	cout<<maxExp(a,b);
	return 0;
}