package easy;

import org.junit.jupiter.api.Test;
import util.ListNode;
import util.ListNodeUtil;

import static org.junit.jupiter.api.Assertions.assertTrue;

class N206ReverseLinkedListTest {

    private final N206ReverseLinkedList reverseLinkedList = new N206ReverseLinkedList();

    /*
        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]
     */
    @Test
    void reverseList1() {
        Integer[] srezActual = {1, 2, 3, 4, 5};
        ListNode head = ListNodeUtil.generateSinglyLinkedListFromArray(srezActual);
        ListNode actual = reverseLinkedList.reverseList(head);
        Integer[] srezExpected = {5, 4, 3, 2, 1};
        ListNode expected = ListNodeUtil.generateSinglyLinkedListFromArray(srezExpected);
        assertTrue(ListNodeUtil.equals(expected, actual));
    }

    /*
        Input: head = [1,2]
        Output: [2,1]
     */
    @Test
    void reverseList2() {
        Integer[] srezActual = {1, 2};
        ListNode head = ListNodeUtil.generateSinglyLinkedListFromArray(srezActual);
        ListNode actual = reverseLinkedList.reverseList(head);
        Integer[] srezExpected = {2, 1};
        ListNode expected = ListNodeUtil.generateSinglyLinkedListFromArray(srezExpected);
        assertTrue(ListNodeUtil.equals(expected, actual));
    }

    /*
        Input: head = []
        Output: []
     */
    @Test
    void reverseList3() {
        Integer[] srezActual = new Integer[0];
        ListNode head = ListNodeUtil.generateSinglyLinkedListFromArray(srezActual);
        ListNode actual = reverseLinkedList.reverseList(head);
        Integer[] srezExpected = new Integer[0];
        ListNode expected = ListNodeUtil.generateSinglyLinkedListFromArray(srezExpected);
        assertTrue(ListNodeUtil.equals(expected, actual));
    }
}