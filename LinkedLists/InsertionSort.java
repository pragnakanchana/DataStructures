/*

APPROACH : Instead of transferring elements to right and then inserting elem at its correct position, swap everytime whenever incorrect comparision has occured

REFERENCE LINK : https://www.youtube.com/watch?v=_5_v2E0OWVs

*/
public class Solution {
    public ListNode insertionSortList(ListNode A) {
        if(A.next == null){
            return A;
        }
        ListNode curr = A.next;
        ListNode ip = A;
        while(curr != null){
            ip = A; 
            while(ip != curr){
                if(ip.val > curr.val){
                    //System.out.println("swap " + curr.val + " and " + ip.val);
                    int temp = ip.val;
                    ip.val = curr.val;
                    curr.val = temp;
                    
                }
                else{
                    ip = ip.next;
                }
            }
            curr = curr.next;
        }
        return A;
    }
}
