/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode len =  head;
        ListNode temp = head;
        if(head.next == null) return head.next;
        int count = 0;
        while(len != null){
            len =  len.next;
            count++;
        }
        int mid =  count/2;
        while(mid > 1){
            temp = temp.next;
            mid--;
        }
        temp.next = temp.next.next;
        return head;
    }

}