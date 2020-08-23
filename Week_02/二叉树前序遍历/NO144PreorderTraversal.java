/**
 * 给定一个二叉树，返回它的 前序 遍历。
 */
public class NO144PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList();
        }
        List<Integer> values = new ArrayList<>();
        recurNode(root,values);
        return values;
    }
    
    public void recurNode(TreeNode node, List<Integer> list){
        list.add(node.val);
        
        if (node.left != null){
            recurNode(node.left,list);
        }
        
        if (node.right != null){
            recurNode(node.right,list);
        }
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
