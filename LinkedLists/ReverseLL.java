class Sol
{
    public static Node reverse(Node head){
        if(head == null){
            return head;
        }
        else if(head.next == null){
            
            return head;
        }
        Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
        return head;     
    }
}
