/*
 * Reverse Linked List II
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

public class Solution092 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || m > n) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        for (int i = 1; i < m; i++) {
            head = head.next;
        }

        ListNode prevmNode = head;
        ListNode mNode = head.next;
        ListNode nNode = mNode;
        ListNode postnNode = nNode.next;
        for (int i = m; i < n; i++) {
            ListNode temp = postnNode.next;
            postnNode.next = nNode;
            nNode = postnNode;
            postnNode = temp;
        }

        mNode.next = postnNode;
        prevmNode.next = nNode;

        return dummy.next;
    }
}
