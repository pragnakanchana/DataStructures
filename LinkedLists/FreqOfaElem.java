class GfG
{
    public static int frequency(Node node, int search)
    {
        int count = 0;
        Node temp = node;
        while(temp != null)
        {
            if(temp.data == search)
              count++;
              
            temp = temp.next;
        }
        
        return count;
    }
}