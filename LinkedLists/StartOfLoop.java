/*
Problem : Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
APPROACH : Floyds algorithm
*/
public ListNode detectCycle(ListNode a) {
        if (a == null || a.next == null)
            return null;
 
        ListNode slow = a, fast = a;
        slow = slow.next;
        fast = fast.next.next;
 
    while (fast != null && fast.next != null) {
        if (slow == fast)
            break;
        slow = slow.next;
        fast = fast.next.next;
    }
 
    if (slow != fast)
        return null;
 
    slow = a;
    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }
 
    return slow;
    }
