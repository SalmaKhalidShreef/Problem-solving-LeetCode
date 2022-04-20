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
class Solution {
    private TreeNode swap1;
    private TreeNode swap2;
    private TreeNode prev;
    
    
    public void recoverTree(TreeNode root) {
        inorder(root);
        
        int temp = swap1.val;
        swap1.val=swap2.val;
        swap2.val = temp;
    }
    
    private void inorder(TreeNode root) {
        if (root==null) return;
        
        inorder(root.left);
        
        if (prev==null) {
            prev = root;
        } else {
            if (prev.val>root.val) {
                swap1=root;
                if (swap2==null) swap2=prev;
                else return;
            }
           //swap1=1,swap2=3,prev=2
            prev = root;
        }
        
        inorder(root.right);
    }

}