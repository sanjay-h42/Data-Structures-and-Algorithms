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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;

        ListNode a=headA;
        ListNode b=headB;
           // if a & b have different len,then we will stop the loop after the second iteration
         while(a!=b){
               //for the end of the first iteration we just rest the pointer to the head of the another LinkedList
            a=a==null ? headB:a.next;
            b=b==null ? headA:b.next;

         }
         return b;
    }
}
