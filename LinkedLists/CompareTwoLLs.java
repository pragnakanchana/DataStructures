class GfG
{
    int compare(Node node1, Node node2)
    {
        Node p1 = node1;
        Node p2 = node2;
        while(p1 != null && p2 != null){
            if(p1.data > p2.data){
                return 1;
            }
            else if(p1.data < p2.data){
                return -1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        if(p1 != null && p2 == null){
            return 1;
        }
        else if(p2 != null && p1 == null){
            return -1;
        }
        return 0;
    }
}