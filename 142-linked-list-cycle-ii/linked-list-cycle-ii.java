/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =  head;
        ListNode fast =  head;
        ListNode  st =  head;
        int count  = 0;
        while(fast != null && fast.next != null){
           slow = slow.next;          
           fast = fast.next.next;
           if(slow ==  fast ){
        while(st != slow ){
            st = st.next;
            slow = slow.next;
        } return slow;
           }
           

        }
        return null;
    }
}