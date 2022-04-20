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
    Stack<Integer> IteratorRoot;
    public BSTIterator(TreeNode root) {
        this.IteratorRoot=new Stack();
        IteratorRoot.push(Integer.MIN_VALUE);
        Inorder(root);
    }
    
    public int next() {
        int val = IteratorRoot.pop();
        return val;
    }
    
    public boolean hasNext() {
        return IteratorRoot.size()-1>0;
    }
    private void Inorder(TreeNode root){
        if(root==null)
            return;
        Inorder(root.right);
        IteratorRoot.push(root.val);
        Inorder(root.left);
    }
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */