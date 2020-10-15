class Intersect
{
    int count(Node head){
        int c = 0;
        Node p = head;
        while(p != null){
            c++;
            p = p.next;
        }
        return c;
    }
	int intersectPoint(Node headA, Node headB)
	{
	    int c1 = count(headA);
	    int c2 = count(headB);
	    int diff = (c1 > c2) ? c1 - c2 : c2 - c1;
	    
	    Node p1,p2;
	    if(c1 > c2){
	       p1 = headA;
	       p2 = headB;
	    }
	    else{
	        p1 = headB;
	        p2 = headA;
	    }
	    
	    
	    for(int i = 0 ; i < diff  && p1 !=  null; i++){
	        p1 = p1.next;
	    }
	    while( p1 != null && p2 != null){
	        if(p1 == p2){
	            return p1.data;
	        }
	        p1 = p1.next;
	        p2 = p2.next;
	    }
	    
	    return p1.data;
	    
	}
}


