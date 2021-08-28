public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode pre = null, cur = head, next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private static final class ListNode {
        int val;
        ListNode next;
    }
}
