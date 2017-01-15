/*
 * Remove Duplicates from Sorted List II
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

public class Solution082 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val != curr.next.val) {
                prev.next = curr;
                prev = prev.next;
            } else {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
