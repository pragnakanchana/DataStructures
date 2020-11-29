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
    
    
    //Edge Cases : 1, 9, 99 , 49, 499 
    public static Node addOne(Node head) 
    { 
        Node rev_start = reverse(head);
	    Node p = rev_start;
        if(head == null){
            return head;
        }
	int carry = 0;
	if(p.next == null){
	   if(p.data < 9)
	      	p.data++;
	   else{
	    p.data = 0;
	    Node temp = new Node(1);
	    p.next = temp;
    	        
	   }
	}
	else{
	    while( p.next != null) {
    		if(p.data == 9){
			    p.data = 0;
			    carry = 1;
			    p = p.next;
		    }   
		    else{
			    p.data += 1;
			    break;
		    }
	    }
    	    if(p.next == null && carry == 1){
    	    	if(p.data < 9){
    	        	p.data++;
    	    	}
    	    	else{
    	    		p.data = 0;
	    		Node temp = new Node(1);
		    	p.next = temp;
    	    	}
	    }
        }
	return reverse(rev_start);
    }
}
