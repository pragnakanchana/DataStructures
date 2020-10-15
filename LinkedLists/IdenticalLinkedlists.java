class Solution {
    
    // Function which returns true if both linked
    // lists are identical else return false
    public boolean isIdentical (Node head1, Node head2){
        //write your code here and return true if they are identical, otherwise false
        Node p1 = head1;
        Node p2 = head2;
        
        while(p1 != null && p2  != null){
            if(p1.data == p2.data){
                p1 = p1.next;
                p2 = p2.next;
            }
            else{
                return false;
            }
        }
        if(p1 != null || p2 != null){
            return false;
        }
        return true;
    }
}