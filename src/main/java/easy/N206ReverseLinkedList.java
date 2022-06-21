package easy;

import util.ListNode;

public class N206ReverseLinkedList {

    /*
        206. Reverse Linked List
        Given the head of a singly linked list, reverse the list, and return the reversed list.

        Constraints:
            The number of nodes in the list is the range [0, 5000].
            -5000 <= Node.val <= 5000

        https://leetcode.com/problems/reverse-linked-list/
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
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null, currentNode = head, nextNode;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
}
