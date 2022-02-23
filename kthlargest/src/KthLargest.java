public class KthLargest {

    private TreeNode res;

    private int count;

    public int kthLargest(TreeNode root, int k) {

        count = k;





    }

    private void dfs(TreeNode node) {

        if (node == null) {
            return;
        }

        dfs(node.right);

        if (count == 0) {
            res = node;
        }


    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
