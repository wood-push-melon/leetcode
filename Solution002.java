/*
 * Add Two Numbers
 * @tags: Linked List, Math
 *
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode dummy = head;
        int sum = 0;
        int carry = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + carry;
            carry = sum / 10;
            dummy.next = new ListNode(sum % 10);
            l1 = l1.next;
        }
        
        while (l2 != null) {
            sum = l2.val + carry;
            carry = sum / 10;
            dummy.next = new ListNode(sum % 10);
            l2 = l2.next;
        }

        if (carry != 0) {
            dummy.next = new ListNode(carry);
        }

        return head.next;
    }
}
