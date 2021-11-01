public class MaxDepth {

    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    private int dfs (TreeNode node) {
        if (node == null) {
            return 1;
        }
        return Math.max(dfs(node.left), dfs(node.right)) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

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
