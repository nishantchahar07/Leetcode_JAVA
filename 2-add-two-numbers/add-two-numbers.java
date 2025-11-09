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
        ListNode temp =  new ListNode(1); 
        ListNode ans = temp;
        ListNode list1 = l1;
         ListNode list2 = l2;

        int carry = 0;   

        while(list1 != null && list2 != null){
            int sum = (list1.val + list2.val + carry);
            int rem  = sum % 10 ;
            temp.next = new ListNode(rem);
            carry = sum/10;            
            list1 =  list1.next;
            list2 =  list2.next;
            temp = temp.next;



        }
        while(list1 != null){
            int sum = (list1.val + carry);
            int rem  = sum %10 ;
             temp.next = new ListNode(rem);

            carry = sum/10;
           
            list1 =  list1.next; 
            temp = temp.next;
        }
        while(list2 != null){
             int sum = ( list2.val + carry);
             int rem  = sum % 10 ;
             temp.next = new ListNode(rem);
            carry = sum/10;          
            list2 =  list2.next;
            temp = temp.next;
        }
        if(carry != 0){
             temp.next = new ListNode(carry);
        }
        return ans.next ;
    }
}