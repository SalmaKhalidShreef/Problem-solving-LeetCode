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
    ArrayList<Integer> IteratorRoot;
    int pos;
    public BSTIterator(TreeNode root) {
        this.IteratorRoot=new ArrayList();
        pos=1;
        IteratorRoot.add(Integer.MIN_VALUE);
        Inorder(root);
    }
    
    public int next() {
        int val = IteratorRoot.get(pos++);
        return val;
    }
    
    public boolean hasNext() {
        return pos<IteratorRoot.size();
    }
    private void Inorder(TreeNode root){
        if(root==null)
            return;
        Inorder(root.left);
        IteratorRoot.add(root.val);
        Inorder(root.right);
    }
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */