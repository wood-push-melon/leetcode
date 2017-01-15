/*
 * Convert Sorted List to Binary Search Tree
 * @tags: Depth-first Search, Linked List
 *
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class Solution109 {
    private ListNode current;

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        current = head;
        int size = getLength(head);
        return helper(0, size - 1);
    }

    private TreeNode helper(int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode left = helper(start, mid - 1);
        TreeNode root = new TreeNode(current.val);
        current = current.next;
        TreeNode right = helper(mid + 1, end);

        root.left = left;
        root.right = right;
        return root;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }

        return len;
    }
}
