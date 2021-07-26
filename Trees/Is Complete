#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    struct Node *left,*right;
};
Node* newNode(int x){
    Node* nn = new Node;
    nn->data = x;
    nn->left = nn->right = NULL;
    return nn;
}

Node* insert(Node* root,int x){
    if(root == NULL){
        return newNode(x);
    }
    else if(root->data < x){
        root->right = insert(root->right,x);
    }
    else{
        root->left = insert(root->left,x);
    }
    return root;
}
bool isComplete(Node* root){
    queue<Node*> q;
    bool flag = false;
    q.push(root);
    while(!q.empty()){
        int size = q.size();
        while(size--){
            Node* f = q.front();
            q.pop();
            if(f != NULL){
                if(flag) return false;
                q.push(f->left);
                q.push(f->right);
            }
            else{
                flag = true;
            }
            
        }
    }
    return true;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        Node* root = NULL;
        for(int i = 0 ; i < n; i++){
            int x;
            cin >> x;
            root = insert(root,x);
        }
        isComplete(root)? cout << "Yes" : cout << "No";
        cout << endl;
    }
    return 0;
}
