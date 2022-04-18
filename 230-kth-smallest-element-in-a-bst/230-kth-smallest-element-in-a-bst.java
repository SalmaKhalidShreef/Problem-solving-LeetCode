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
    int c;
    int Myk;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        c=0;
        Myk=k;
        res=0;
        helper(root);
        return res ;
        
        
    }

    private void helper (TreeNode root){
        if(root == null)
            return ;
         helper(root.left);
        c++;
        if(c==Myk){
            res = root.val;
            return;
        }
       else
            helper(root.right);
        
    }
}