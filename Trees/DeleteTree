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
void postorder(Node* root){
    if(root ==NULL){
        return ;
    }
    postorder(root->left);
    postorder(root->right);
    cout << root->data << " ";
}

void deleteTree(Node* root){                                      //Perform post order traversal, freeup space of every node using "delete"
    if(root == NULL){
        return ;
    }
    deleteTree(root->left);
    deleteTree(root->right);
    cout << root->data << " ";
    
    delete root;
    root = NULL;
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
        deleteTree(root);
        cout << endl;
        postorder(root);
        cout << endl;
    return 0;
}
