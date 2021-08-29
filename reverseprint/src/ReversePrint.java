
public class ReversePrint {

    private int[] res;
    private int count;
    private int index;

    public int[] reversePrint(ListNode head) {
        dfs(head);
        return res;
    }

    private void dfs(ListNode node) {
        if (node == null) {
            res = new int[count];
            return;
        }
        count++;
        dfs(node.next);
        res[index++] = node.val;
    }

    private static final class ListNode {
        int val;
        ListNode next;
    }
}
