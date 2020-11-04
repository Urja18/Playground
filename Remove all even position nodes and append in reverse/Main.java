// Remove all even position nodes and append in reverse //

#include<bits/stdc++.h>
using namespace std;
struct node
{
    int data;
    struct node *next;
};
struct node *start = NULL;
void printList(struct node *node)
{
    while (node != NULL)
    {
        cout<<node->data<<" ";
        node = node->next;
    }
    
}
void insert()
{
    int n,value;
    cin>>n;
    struct node *temp;
    for(int i=0;i<n;i++)
    {
        cin>>value;
        if(i==0)
        {
            start=(struct node *) malloc(sizeof(struct node));
            start->data=value;
            start->next=NULL;
            temp=start;
            continue;
        }
        
        else
        {
            temp->next= (struct node *) malloc( sizeof(struct node) );
            temp=temp->next;
            temp->data=value;
            temp->next=NULL;
        }
    }
}
void oddReverseEvennodes(struct node *odd)
{
    node *null = NULL;
    if(odd == null)
        return;
    if(odd->next == null)
        return;
    if(odd->next->next == null)
        return;
    node *head1=odd,*head2 = null,*prev = odd;
    odd=odd->next;
    
    while(odd)
    {
        prev->next=odd->next;
	//insertion at the beginning
        odd->next=head2;
        head2=odd;
	//list is even  element
        if(prev->next == null)
        {
            prev->next=head2;
            break;
        }
        prev=prev->next;
	//list is odd elements
        if(prev->next == null)
        {
            prev->next=head2;
            break;
        }
        odd=prev->next;
    }
}
int main()
{
   insert();
   oddReverseEvennodes(start);
   printList(start);
}
