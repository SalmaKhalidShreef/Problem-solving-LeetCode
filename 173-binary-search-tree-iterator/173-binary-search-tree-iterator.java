/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    TreeNode IteratorRoot;
    TreeNode tmp;
    public BSTIterator(TreeNode root) {
        this.IteratorRoot=new TreeNode(Integer.MIN_VALUE);
        tmp=IteratorRoot;
        Inorder(root);
    }
    
    public int next() {
        int val = IteratorRoot.right.val;
        IteratorRoot=IteratorRoot.right;
        return val;
    }
    
    public boolean hasNext() {
        return IteratorRoot.right!=null;
    }
    private void Inorder(TreeNode root){
        if(root==null)
            return;
        Inorder(root.left);
        tmp.right=new TreeNode(root.val);
        tmp=tmp.right;
        Inorder(root.right);
    }
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */