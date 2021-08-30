import java.util.HashMap;
import java.util.Map;

public class CopyRandomList1 {

    public Node copyRandomList(Node head) {

        Node temp = head;
        Map<Node, Node> cache = new HashMap<>();
        while (temp != null) {
            Node n = new Node(temp.val);
            cache.put(temp, n);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            cache.get(temp).next = cache.get(temp.next);
            cache.get(temp).random = cache.get(temp.random);
            temp = temp.next;
        }
        return cache.get(head);
    }

    private static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
        }
    }
}
