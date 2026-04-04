/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    static int size(ListNode head){
        ListNode temp = head;
        int size =0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int size1 = size(headA);
        int size2 = size(headB);
        if(size1>size2){
            int step = size1-size2;
            for(int i =1;i<=step;i++){
                temp1 = temp1.next;
            }
        }else{
            int step = size2-size1;
            for(int i =1;i<=step;i++){
                temp2 = temp2.next;
            }

        }
        while(temp1 != temp2){
            temp1= temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
        

        
    }
}