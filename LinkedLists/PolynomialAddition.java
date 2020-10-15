class GFG
{
    public static Node insert(Node head, int data, int pow){
        Node temp = new Node(data,pow);
        if(head == null || head.pow < pow){
            temp.next = head;
            head = temp;
            return head;
        }
        Node p1 = head;
        while(p1.next != null && p1.pow > pow){
            p1 = p1.next;
        }
        temp.next = p1.next;
        p1.next = temp;
        return head;
    }
    public static Node addPolynomial(Node p1,Node p2)
    {
        Node p3 = null;
        while(p1 != null && p2 != null){
            if(p1.pow > p2.pow ){
             p3 = insert(p3,p1.coeff,p1.pow);
             p1 = p1.next;   
            }
            else if(p1.pow == p2.pow ){
                
                p3 = insert(p3,p1.coeff+p2.coeff,p1.pow);
                p2 = p2.next;
                p1 = p1.next;
            }
            else{
                p3 = insert(p3,p2.coeff,p2.pow);
                p2 = p2.next;
            }
        }
        
        while(p1 != null){
            p3 = insert(p3,p1.coeff,p1.pow);
            p1 = p1.next;
        }
        while(p2 != null){
            p3 = insert(p3,p2.coeff,p2.pow);
            p2 = p2.next;
        }
        return p3;
    }
}