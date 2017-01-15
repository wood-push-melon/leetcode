/*
 * Reverse Linked List
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

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head; // move prev
            head = temp; // move head
        }

        return prev;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        head.next = null;

        ListNode res = reverseList(temp); // this is the new head
        temp.next = head;

        return res;
    }
}
