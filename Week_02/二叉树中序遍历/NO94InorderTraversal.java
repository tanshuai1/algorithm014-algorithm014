/**
 * 二叉树的中序遍历
 */
public class NO94InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        
        if (root == null) {
            return new ArrayList();
        }
        List<Integer> values = new ArrayList<>();
        recurNode(root,values);
        return values;
    }
    
    public void recurNode(TreeNode node,List<Integer> list){
        if (node.left != null){
            recurNode(node.left,list);
        }
        list.add(node.val);
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
