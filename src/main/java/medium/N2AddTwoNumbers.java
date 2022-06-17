package medium;

import util.ListNode;

public class N2AddTwoNumbers {

    /*
        2. Add Two Numbers
        You are given two non-empty linked lists representing two non-negative integers.
        The digits are stored in reverse order, and each of their nodes contains a single digit.
        Add the two numbers and return the sum as a linked list.
        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
        https://leetcode.com/problems/add-two-numbers/

        Constraints:

            The number of nodes in each linked list is in the range [1, 100].
            0 <= Node.val <= 9
            It is guaranteed that the list represents a number that does not have leading zeros.
     */

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), currentNode = result;
        int categoryOfNumber = 0;

        for (ListNode x1 = l1, x2 = l2; (x1 != null || x2 != null); x1 = x1 != null ? x1.next : null, x2 = x2 != null ? x2.next : null) {
            int x1Val = x1 == null ? 0 : x1.val;
            int x2Val = x2 == null ? 0 : x2.val;

            int sum = x1Val + x2Val + categoryOfNumber;
            categoryOfNumber = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
        }
        if (categoryOfNumber > 0) {
            currentNode.next = new ListNode(categoryOfNumber);
        }
        return result.next;
    }
}
