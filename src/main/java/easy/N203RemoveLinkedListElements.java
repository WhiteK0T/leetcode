package easy;

import util.ListNode;

public class N203RemoveLinkedListElements {
    /*
    203. Remove Linked List Elements
    Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

    Constraints:
        The number of nodes in the list is in the range [0, 10 v 4].
        1 <= Node.val <= 50
        0 <= val <= 50

    https://leetcode.com/problems/remove-linked-list-elements/
     */

    public ListNode removeElementsIter(ListNode head, int val) {
        for (ListNode current = head, prev = head; current != null ; current = current.next) {
            if (current.val == val) {
                if (current == head) {
                    head = prev = current.next;
                    continue;
                }
                prev.next = current.next;
                continue;
            }
            prev = current;
        }
        return head;
    }

    //Recursive
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}

