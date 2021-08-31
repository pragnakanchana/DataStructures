#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n = 8;
    int a[n] = {2, 5, 2, 8, 5, 6, 8, 8};
    map<int,int> mp;
    for(int i = 0 ; i < n ; i++){
        mp[a[i]]++;
    }
    priority_queue<pair<int,int>> maxh;
    for(auto x: mp){
        maxh.push({x.second,x.first});
    }
    while(!maxh.empty()){
        int f = maxh.top().first;
        int elem = maxh.top().second;
        for(int i = 0 ; i < f ; i++){
            cout << elem << " ";
        }
        maxh.pop();
    }
    return 0;
}

/*Output:
8 8 8 5 5 2 2 6
*/
