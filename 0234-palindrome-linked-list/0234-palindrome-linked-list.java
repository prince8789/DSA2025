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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
        
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;           
        }
        ListNode temp = head;
        ListNode mid = reverse(slow);
        while(mid != null){
            if(mid.val != temp.val) return false;
            else {
                mid= mid.next;
                temp = temp.next;
            }
        }
        return true;
        
    }
}