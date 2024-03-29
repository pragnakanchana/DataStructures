//APPROCH-1 : USING HASHSET
public boolean hasCycle(ListNode head) {
    Set<ListNode> nodesSeen = new HashSet<>();
    while (head != null) {
        if (nodesSeen.contains(head)) {
            return true;
        } else {
            nodesSeen.add(head);
        }
        head = head.next;
    }
    return false;
}


//APPROCH-2 : USING @ POINTERS

bool hasCycle(ListNode *head) {
        ListNode* slow = head;
        ListNode* fast = head;
        while (fast != NULL && fast->next != NULL) {            //shouldnt place slow != fast cond in while loop, donot iterate  //fast->next shouldnot be null since we are accessing fast->next->next
            slow = slow->next;
            fast = fast->next->next;
            if (slow == fast) {                                 //condition should be checked after changing positions of slow and fast pointers
                return true;
            }
        }
        return false;
}
