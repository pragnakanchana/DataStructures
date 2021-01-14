/* Problem : Interview bit k reverse problem , where k is a factor of n */
public class Solution {
    public ListNode reverseList(ListNode head, int k) {
        if(k == 1 || head == null || head.next == null){
            return head;
        }
        int n = 0; // count
        ListNode curr = head;
        while(curr !=  null){
            n++;
            curr = curr.next;
        }
        
        ListNode prev = null, next, newHead = null; 
        ListNode t1 = null, t2 = head;
        curr = head;
        
        while(n >= k){
            for(int i = 0; i < k; i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if(newHead == null) newHead = prev;
            if(t1 != null) t1.next = prev;
           // t2.next = curr; // n is not multiple of k
            t1 = t2;
            t2 = curr;
            prev = null;
            n -= k;
        }
        return newHead;
    }
}
