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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode ll = node;
        int rem  = 0;
        int div = 0;
        while(l2 != null && l1 != null){
             rem = (l1.val + l2.val +div)%10;       
             ll.next = new ListNode(rem );
             div =   (l1.val + l2.val +div)/10;
             l1 =  l1.next;
             l2 = l2.next;
            ll =  ll.next;
        }
        while(l2 != null){
            rem =  (l2.val+div)%10;
            ll.next = new ListNode(rem);
            div = (l2.val+div)/10 ;
            ll = ll.next;
            l2 = l2.next;
        }
         while(l1 != null){
            rem =  (l1.val+div)%10;
            ll.next = new ListNode(rem);
            div = (l1.val+div)/10 ;
            ll = ll.next;
           l1 =  l1.next;
        }
        if(div > 0){
            ll.next = new ListNode(div);
        }
        return node.next;
    }
}