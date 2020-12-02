
//No need of extra space - temp variable to insert new node at end
//Just pointing to the node required - making use of the point -> "any no of nodes can be directed a single node but a particular node will have only one next pntr;"
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode p3 = l3;
        ListNode p1 = l1, p2 = l2;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                p3.next = p1;
                p3 = p3.next;
                p1 = p1.next;      //donot forget
            }
            else{
                p3.next = p2;
                p3 = p3.next;
                p2 = p2.next;       //donot forget
            }
        }
        if(p1 == null){
            p3.next = p2;          // just linking the remaining part and not iterating over the remaining list
        }
        if(p2 == null){
            p3.next = p1;
        }
        return l3.next;
    }
}
