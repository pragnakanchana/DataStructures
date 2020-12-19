

/*
PROBLEM :
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5

APPROACH : maintain 2 pointers one pointing to the node having data ;less than B , and another pointing to data greater than B,,, 
           and a pointer to traverse the entire list is mandatory..

*/

ListNode* Solution::partition(ListNode* A, int B) {
    
    ListNode *p = A;
    ListNode *p1,*p2;
    ListNode* dummy = new ListNode(-1);
    p1 = dummy;
    ListNode* dummy2 = new ListNode(-1);
    p2 = dummy2;
    
    while(p != NULL){
        if(p->val < B){
            p1->next = p;
            p1 =p1->next;
        }
        else{
            p2->next = p;
            p2 = p2->next;
        }
        p = p->next;
    }
    
    p2->next = NULL;
    p1->next = dummy2->next;
    return dummy->next;
    
    
}
