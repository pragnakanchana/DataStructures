class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
        Node slow = head;
        Node fast = head;
        int i;
        for(i = 1 ; i <= k && fast.next != null ; i++){
            fast = fast.next;
        }
        if(i > k){
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        }
        int sum = 0;
        while(slow != null){
            sum += slow.data;
            slow = slow.next;
        }
        return sum;
    }
}