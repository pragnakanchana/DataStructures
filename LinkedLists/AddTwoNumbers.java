public ListNode addTwoNumbers(ListNode l1, ListNode l2) {         // after reversing this method is called
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;                    // curr is initialzed at dummy head having 0 and in very iteration curr is UPDATED AND MODIFIED AND THEN DUMMY.NEXT IS RETURNED
    int carry = 0;
    while (p != null || q != null) {                              // '||' is prefered over '&&'  because it has to fail when both p and q are null
        int x = (p != null) ? p.val : 0;                          // if linkedlists are of diff lengths, then 0 is added to the empty slot(without effecting original linkedlists)
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}

public ListNode res(ListNode l1, ListNode l2) {
    l1 = reverse(l1);
    l2 = reverse(l2);
    l3 = addTwoNumbers(l1,l2);
    l3 = reverse(l3);
    return l3;
}
