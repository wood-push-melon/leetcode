/*
 * Linked List Cycle
 * @tags: Linked List, Two Pointers
 *
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
