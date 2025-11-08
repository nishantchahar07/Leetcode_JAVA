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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode len =  head;
        int count = 0;
        ListNode temp = head;
        while(len != null){
            len =  len.next;
            count++;
         
        }
           System.out.print(count);
        int travel = count-n;
        if(count == n) return head.next;
        while(travel > 1){
            temp = temp.next;
            travel--;
        }
        temp.next = temp.next.next;
        return head;
    }
}