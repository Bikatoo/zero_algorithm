import java.util.ArrayList;
import java.util.List;

public class KthLargest1 {

    private List<TreeNode> nodes;

    public int kthLargest(TreeNode root, int k) {

        nodes = new ArrayList<>();
        dfs(root);
        return nodes.get(k - 1).val;
    }

    private void dfs(TreeNode node) {

        if (node == null) {
            return;
        }
        dfs(node.right);
        nodes.add(node);
        dfs(node.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
