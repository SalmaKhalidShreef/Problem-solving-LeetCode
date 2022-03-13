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
    static List <Integer> sol;
    public List<Integer> postorderTraversal(TreeNode root) {
         sol = new ArrayList();
        helper(root);
        return sol;
    }
    public void helper (TreeNode node){
        if(node == null)
            return;
        helper(node.left);
        helper(node.right);
        sol.add(node.val);
    }
}