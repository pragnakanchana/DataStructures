class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here
	if(head == null){
	  return true;  
	}
	Node p  = head.next;
	while(p != null && p != head){
	    p = p.next;
	}
	if(p == head){
	    
	    return true;
	}
	return false;
    }
}