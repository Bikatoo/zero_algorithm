public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
