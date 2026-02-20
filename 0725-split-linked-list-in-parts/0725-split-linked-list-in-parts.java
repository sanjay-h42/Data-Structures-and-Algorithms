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
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] result = new ListNode[k];

        // Step 1: Calculate size
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        // Step 2: Calculate base size and extra nodes
        int splitSize = size / k;
        int extra = size % k;

        current = head;

        // Step 3: Split into k parts
        for (int i = 0; i < k; i++) {

            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;

            int currentSize = splitSize + (extra > 0 ? 1 : 0);
            if (extra > 0) extra--;

            for (int j = 0; j < currentSize && current != null; j++) {
                tail.next = new ListNode(current.val);
                tail = tail.next;
                current = current.next;
            }

            result[i] = dummy.next; // store part
        }

        return result;
    }
}
