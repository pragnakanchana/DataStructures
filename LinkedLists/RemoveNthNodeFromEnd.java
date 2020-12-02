//APPROACH 1 : IN TWO PASSES - COUNTING
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    int length  = 0;
    ListNode first = head;
    while (first != null) {
        length++;
        first = first.next;
    }
    length -= n;
    first = dummy;
    while (length > 0) {
        length--;
        first = first.next;
    }
    first.next = first.next.next;
    return dummy.next;
}

//APPROACH 2 : In One Pass - two pointer approach
//================================================
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        int i = 0;
        for(i =  0 ; i < n && fast.next != null; i++){
            fast = fast.next;
            
        }
        if(fast.next == null && i < n){
            head = head.next;                                                                   // If count = N i.e.
            return head;                                                                        // delete the head node 
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
