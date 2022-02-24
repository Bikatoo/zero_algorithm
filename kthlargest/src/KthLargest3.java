public class KthLargest3 {

    private int res;
    private int count;

    public int kthLargest(TreeNode root, int k) {

        count = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node) {

        if (node == null) {
            return;
        }
        dfs(node.right);
        if (count == 0) {
            return;
        }
        res = node.val;
        if (--count == 0) {
            return;
        }
        dfs(node.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(1);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n4.left = n5;

        System.out.println(new KthLargest3().kthLargest(root, 3));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

}
