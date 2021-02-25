/*
Problem : https://www.interviewbit.com/problems/single-number-ii/

Solution : https://www.youtube.com/watch?v=jO7uGdvGGC4

Approach : Just finding the sum of bits at each position in all array elements and find modulo by 3
*/

int Solution::singleNumber(const vector<int> &A) {
    int x = 0;
    
    
    for(int i = 0 ; i < 32 ; i++){
        int sum = 0;
        for(int j = 0 ; j < A.size()  ; j++){
            if((1 << i) & A[j] ){
                sum++;
            }
        }
        //cout << sum << endl;
        int y;
        if(sum % 3 == 1)
            x += pow(2,i);
        
    }
    //cout << x << endl;
    return x;
}
 
