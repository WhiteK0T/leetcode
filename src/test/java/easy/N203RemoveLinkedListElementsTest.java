package easy;

import org.junit.jupiter.api.Test;
import util.ListNode;
import util.ListNodeUtil;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class N203RemoveLinkedListElementsTest {

    N203RemoveLinkedListElements removeLinkedListElements = new N203RemoveLinkedListElements();

    /*
        Input: head = [1,2,6,3,4,5,6], val = 6
        Output: [1,2,3,4,5]
    */
    @Test
    void removeElements1() {
        ListNode head = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{1, 2, 6, 3, 4, 5, 6});
        removeLinkedListElements.removeElements(head, 6);
        checkRemoveElement(head, 6);
        //ListNodeUtil.printListNode(head1);
    }

    /*
        Input: head = [1,2,2,1], val = 2
        Output: [1,1]
    */
    @Test
    void removeElements2() {
        ListNode head = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{1, 2, 2, 1});
        removeLinkedListElements.removeElements(head, 2);
        checkRemoveElement(head, 2);
        //ListNodeUtil.printListNode(head);
    }

    /*
        Input: head = [7,7,7,7], val = 7
        Output: []
    */
    @Test
    void removeElements3() {
        ListNode head = ListNodeUtil.generateSinglyLinkedListFromArray(new Integer[]{7, 7, 7, 7});
        ListNode node = removeLinkedListElements.removeElements(head, 7);
        //ListNodeUtil.printListNode(node);
        assertNull(node);
    }

    /*
        Input: head = [], val = 7
        Output: []
    */
    @Test
    void removeElements4() {
        ListNode node = removeLinkedListElements.removeElements(null, 7);
        assertNull(node);
        //ListNodeUtil.printListNode(node);
    }

    private static void checkRemoveElement(ListNode head, int element) {
        if (head == null) return;
        for (ListNode x = head; x != null; x = x.next) {
            assertNotEquals(element, x.val);
        }
    }
}