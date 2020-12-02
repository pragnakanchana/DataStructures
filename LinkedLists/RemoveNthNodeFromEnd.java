
APPROACH 2
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
