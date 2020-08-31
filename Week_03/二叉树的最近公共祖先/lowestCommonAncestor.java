public class lowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        TreeNode lnode = lowestCommonAncestor(root.left, p, q);
        TreeNode rnode = lowestCommonAncestor(root.right, p, q);
        if (lnode != null && rnode != null) {
            return root;
        } else if (lnode == null) {
            return rnode;
        } else if (rnode == null) {
            return lnode;
        }
        return null;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
