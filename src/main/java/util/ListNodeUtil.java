package util;

public final class ListNodeUtil {

    private ListNodeUtil() {
    }

    public static ListNode generateSinglyLinkedListFromArray(Integer[] srez) {
        ListNode head = new ListNode(srez[0], null);
        ListNode current = head;
        for (int i = 1; i < srez.length; i++) {
            current = current.next = new ListNode(srez[i], null);
        }
        return head;
    }

    public static void printListNode(ListNode head) {
        if (head == null) System.out.println("Head = null");
        for (ListNode x = head; x != null; x = x.next) {
            System.out.println(x.val);
        }
    }

}