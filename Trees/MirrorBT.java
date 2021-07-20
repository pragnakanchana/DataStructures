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

int main() { 
   
        int n;
        cin >> n;
        Node* root = NULL;
        for(int i = 0 ; i < n ; i++){
            int x;
            cin >> x;
            root = insert(root, x);
        }
        inorder(root);
        cout << endl;
        mirror(root);
        inorder(root);
        cout << endl;
    return 0;
}
