// ARRAY TO BST //
#include<bits/stdc++.h>
using namespace std;
struct Node
{
    public:
    int data;
    Node *left;
    Node* right;
};
Node *newnode(int x) {
    Node* node = (Node*)malloc(sizeof(Node*));
    node->data = x;
    node->left = NULL;
    node->right = NULL;
    return node;
}
Node* makebst(int a[], int l, int r) 
{
   if(l>r) return NULL;
  	int mid =(l+r)/2;
   Node* root = newnode(a[mid]);
   root->left = makebst(a, l, mid-1);
   root->right = makebst(a,mid+1,r);
   return root;
}
void preorder(Node* root) {
    if(!root) return;
    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}
int main()
 {
	int t; cin>>t;
	while(t--) {
	    int n,i;
	    cin>>n;
	    int a[n];
	    for(i=0; i<n; i++)
	        cin>>a[i];
	    Node* root;
	        root = makebst(a,0,n-1);
	    preorder(root);
	    cout<<endl;
	}
	return 0;
}
