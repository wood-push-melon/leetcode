/*
 * Swap Nodes in Pairs
 * @tags: Linked List
 *
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class Solution024 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;

        while (p.next != null && p.next.next != null) {
            ListNode n1 = p.next;
            ListNode n2 = p.next.next;

            p.next = n2;
            n1.next = n2.next;
            n2.next = n1;

            p = n1;
        }

        return dummy.next;
    }
}
