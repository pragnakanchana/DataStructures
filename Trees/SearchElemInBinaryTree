#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node *left, *right;
};

Node* newNode(int x){
    Node* temp = new Node;
    temp->data = x;
    temp->left = NULL;
    temp->right = NULL;
    return temp;
}
Node* insert(Node* root, int x){
    if(root == NULL)
        return newNode(x);
    else if(root->data > x)
        root->left =  insert(root->left,x);
    else
        root->right =  insert(root->right,x);
    return root;
}
void inorder(Node* root){
    if(root ==NULL){
        return ;
    }
    inorder(root->left);
    cout << root->data << " ";
    inorder(root->right);
}
void preorder(Node* root){
    if(root ==NULL){
        return ;
    }
    cout << root->data << " ";
    preorder(root->left);
    preorder(root->right);
}
void postorder(Node* root){
    if(root ==NULL){
        return ;
    }
    postorder(root->left);
    postorder(root->right);
    cout << root->data << " ";
}

void preorderIterative(Node* root){
    stack<Node*> s;
    s.push(root);
    while(!s.empty()){
        Node* x = s.top();
        s.pop();
        cout << x->data << " ";
        if(x->right != NULL){
            s.push(x->right);
        }
        if(x->left != NULL){
            s.push(x->left);
        }
    }
    
}
void postorderIterative(Node* root){
    stack<Node*> s1,s2;
    s1.push(root);
    while(!s1.empty()){
        Node* x = s1.top();
        s1.pop();
        s2.push(x);
        
        if(x->left != NULL){
            s1.push(x->left);
        }
        if(x->right != NULL){
            s1.push(x->right);
        }
    }
    while(!s2.empty()){
        cout << s2.top()->data << " ";
        s2.pop();
    }
    
}

void inorderIt(Node* root){
    stack<Node *> s;
    Node *curr = root;
    while (curr != NULL || s.empty() == false)
    {
        while (curr !=  NULL)
        {
            s.push(curr);
            curr = curr->left;
        }
        curr = s.top();
        s.pop();
        cout << curr->data << " ";
        curr = curr->right;
 
    }
}

bool search(Node* root, int n){
    if(root != NULL){
        if(root->data == n)
            return true;
        else
            return search(root->left, n) || search(root->right,n);
    }
    return false;
}

bool searchIter(Node* root, int n){
    queue<Node*> q;
    q.push(root);
    while(!q.empty()){
        Node* x = q.front();
        q.pop();
        if(x->data == n){
            return true;
        }
        q.push(x->left);
        q.push(x->right);
    }
    return false;
}
int main() {
   
        int n;
        cin >> n;
        Node* root = NULL;
        for(int i = 0 ; i < n ; i++){
            int x;
            cin >> x;
            root = insert(root, x);
        }
        
        postorder(root);
        cout << endl;
        cout<< search(root,4) << endl;
        cout<< searchIter(root,4) << endl;
    return 0;
}
