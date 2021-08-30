public class CopyRandomList2 {

    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        //1. 将旧链表处理成 node1 -> node1(new) -> node2 -> node2(new) ->...的形式
        Node temp = head;
        while (temp != null) {
            Node n = new Node(temp.val);
            n.next = temp.next;
            temp.next = n;
            temp = n.next;
        }

        //2. 处理random指向
        temp = head;
        while (temp != null) {
            //如果旧节点本身没有random，那么复制的新节点也不会有
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        //3. 拆分新旧链表
        temp = head.next;
        Node pre = head, res = head.next;
        while (temp.next != null) {
            pre.next = pre.next.next;
            temp.next = temp.next.next;
            pre = pre.next;
            temp = temp.next;
        }
        //断开新旧链表的连接
        pre.next = null;
        return res;
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
