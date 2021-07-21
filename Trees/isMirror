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

void mirror(Node* root){
    if(root != NULL){
        Node* t = root->left;
        root->left = root->right;
        root->right = t;
    }
    if(root->left != NULL)
        mirror(root->left);
    if(root->right != NULL)
        mirror(root->right);
}
bool checkMirror(Node* root1,Node* root2){
    if(root2 == NULL && root1 == NULL)
        return true;
    if(root1->data != root2->data)
        return false;
    if((root1 == NULL && root2 != NULL) || (root2 == NULL && root1 != NULL))
        return false;
    return checkMirror(root1->right,root2->left) && checkMirror(root1->left, root2->right);
    
}
int main() { 
   
        Node* root1 = newNode(1);
		root1->left = newNode(2);
		root1->left->right = newNode(3);
		root1->right = newNode(4);

		Node* root2 = newNode(1);
		root2->right = newNode(2);
		root2->right->left = newNode(3);
		root2->left = newNode(4);
		
        inorder(root1);
        cout << endl;
        
        inorder(root2);
        cout << endl;
        
        mirror(root1);
        inorder(root1);
        cout << endl;
        
        cout << checMirror(root1,root2);
        
    return 0;
}
