class Gfg {
    Node rotateP (Node head, int p){
        if(p == 0){
            return head;
        }
        Node ptr = head;
        for(int i = 0 ; i < p-1 ; i++){
            ptr = ptr.next;
        }
        if(ptr.next == null){
            return head;
        }
        ptr.next.prev = null;
        Node ptr2 = ptr.next;
        Node newhead = ptr.next;
        ptr.next = null;
        while(ptr2.next != null){
            ptr2 = ptr2.next;
        }
        ptr2.next = head;
        head.prev = ptr2;
        return newhead;
    }
    
}