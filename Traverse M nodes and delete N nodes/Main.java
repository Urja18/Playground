/*Traverse M nodes and delete N nodes
Given head to the singly linear linked list,
traversal M nodes and delete N node repeatedly until you reach the end*/
#include<bits/stdc++.h>
using namespace std;
struct S_Node
{
    int data;
    S_Node *next;
};
void MTraverseNDelete(struct S_Node  *head, int M, int N)
{
    int count = 0;
    S_Node *cur=head,*prev=head,*rem;
    while(cur != NULL)
    {
        for(int i=0;i<M;i++)
        {
            if(cur == NULL)
                break;
            prev=cur;
            cur=cur->next;
        }
        if(cur == NULL)
            break;
        for(int i=0;i<N;i++)
        {
            if(cur == NULL)
                break;
            rem=cur;
            cur=cur->next;
            free(rem);
        }
            prev->next=cur;
    }  
}
struct S_Node *start = NULL;
void Traversal(struct S_Node *S_Node)
{
    while (S_Node != NULL)
    {
        cout<<S_Node->data<<" ";
        S_Node = S_Node->next;
    }
	cout<<endl;
    
}
void CreateList(int n1)
{
    int n,value;
    n=n1;
    struct S_Node *temp;
    for(int i=0;i<n;i++)
    {
        cin>>value;
        if(i==0)
        {
            start=(struct S_Node *) malloc( sizeof(struct S_Node) );
            start->data=value;
            start->next=NULL;
            temp=start;
            continue;
        }
        else
        {
            temp->next= (struct S_Node *) malloc( sizeof(struct S_Node) );
            temp=temp->next;
            temp->data=value;
            temp->next=NULL;
        }
    }
}
int main()
{
    int n1;
	cin>>n1;
    int m,n;
    cin>>m;
    cin>>n;
	CreateList(n1);
    MTraverseNDelete(start,m,n);
	Traversal(start);
    return 0;
}
