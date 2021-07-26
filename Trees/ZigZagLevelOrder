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
                                                              /* Method1 : using 1 uqeue, 1 stack*/
void zigzagl(Node* root){ 
    bool d = false;
    queue<Node*> q;
    q.push(root);
    stack<Node*> s;
    while(!q.empty()){
        int size = q.size();
        while(size--){
            Node* f = q.front();
            q.pop();
            if(d){
                cout << f->data << " ";
            }
            else{
                s.push(f);
            }
            if(f->left != nullptr) q.push(f->left);
            if(f->right != NULL) q.push(f->right);
        }
        if(!d){
            while(!s.empty()){
                Node* x= s.top();
                s.pop();
                cout << x->data << " ";
            }
        }
        d = !d;
    }
}
                                                             /* Method2 : using  2stacks*/
void zigzagl(Node* root){
    //bool d = false;
    stack<Node*> s1;
    stack<Node*> s2;
    s1.push(root);
    while(!s1.empty() || !s2.empty()){
        while(!s1.empty()){
            Node* f = s1.top();
            s1.pop();
            cout << f->data << " ";
            if(f->right != NULL) s2.push(f->right);
            if(f->left != NULL) s2.push(f->left);
        }
        while(!s2.empty()){
            Node* f = s2.top();
            s2.pop();
            cout << f->data << " ";
            if(f->left != NULL) s1.push(f->left);
            if(f->right != NULL) s1.push(f->right);
        }
    }
}
                                                             /* Method3 : using deque*/
void zigzagl(Node* root){
    bool d = false;
    deque<Node*> dq;
    dq.push_front(root);
    while(!dq.empty()){
        int size = dq.size();
        while(size--){
            if(d){
                Node* f = dq.front();
                dq.pop_front();
                cout << f->data << " ";
                if(f->left != NULL) dq.push_back(f->left);
                if(f->right != NULL) dq.push_back(f->right);
            }
            else{
                Node* f = dq.back();
                dq.pop_back();
                cout << f->data << " ";
                if(f->right != NULL) dq.push_front(f->right);
                if(f->left != NULL) dq.push_front(f->left);
            }
        }
        d = !d;
    }
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
        zigzagl(root);
        cout << endl;
    }
    return 0;
}
