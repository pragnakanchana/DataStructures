class Solution {
    Node deleteMid(Node head) {
    
        if(head == null ){
            return null;
        }
        
        else if( head.next == null){
            head.next = null;
            return head;
        }
        
        else if(head.next.next == null){
             head.next = head.next.next;
             return head;
        }
        
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
        

    }
}