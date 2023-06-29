package medium;

import org.junit.jupiter.api.Test;
import util.ListNode;
import util.ListNodeUtil;

import static org.junit.jupiter.api.Assertions.assertTrue;

class N2AddTwoNumbersTest {

    private final N2AddTwoNumbers addTwoNumbers = new N2AddTwoNumbers();

    /*
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
     */
    @Test
    void addTwoNumbers1() {
        ListNode l1 = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{2, 4, 3});
        ListNode l2 = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{5, 6, 4});
        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode expected = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{7, 0, 8});
        assertTrue(ListNodeUtil.equals(expected, actual));
    }

    /*
        Input: l1 = [0], l2 = [0]
        Output: [0]
     */
    @Test
    void addTwoNumbers2() {
        ListNode l1 = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{0});
        ListNode l2 = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{0});
        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode expected = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{0});
        assertTrue(ListNodeUtil.equals(expected, actual));
    }

    /*
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
     */
    @Test
    void addTwoNumbers3() {
        ListNode l1 = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{9, 9, 9, 9});
        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode expected = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{8, 9, 9, 9, 0, 0, 0, 1});
        assertTrue(ListNodeUtil.equals(expected, actual));
    }
}