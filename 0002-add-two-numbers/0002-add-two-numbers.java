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
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode a = new ListNode(100);
        ListNode head = a;
        int c = 0;
        while(temp1 != null || temp2 != null){ 
            int sum = 0;
            if(temp1 != null){
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                sum+=temp2.val;
                temp2= temp2.next;
            }
            sum = sum+c;

            ListNode temp = new ListNode(sum%10);
            c = sum/10;
            a.next = temp;
            a= a.next;
        }
        if(c>0){
            ListNode temp = new ListNode(c);
            a.next = temp;
            a= a.next;
        }
        return head.next;
        
    }
}