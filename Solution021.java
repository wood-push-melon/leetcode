/*
 * Merge Two Sorted Lists
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

public class Solution021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        while (l1 != null) {
            p.next = l1;
            p = p.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            p.next = l2;
            p = p.next;
            l2 = l2.next;
        }

        return dummy.next;
    }
}
