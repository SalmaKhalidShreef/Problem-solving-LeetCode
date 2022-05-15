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
    int maxDepth;
    int res;
    public int deepestLeavesSum(TreeNode root) {
        maxDepth= 0;
        res=0;
        dfs(root,0);
        //dfs2(root,0);
        return res;
        
    }
    private void dfs(TreeNode node,int d){
        if(node==null)
            return;
        if(d==maxDepth){
            res+=node.val;
        }
        if(d>maxDepth){
            res=node.val;
            maxDepth=d;
        }
        dfs(node.right,d+1);
        dfs(node.left,d+1);
    }
    private void dfs2(TreeNode node,int lvl){
        if(node==null)
            return;
        if(lvl==maxDepth)
            res+=node.val;
        dfs2(node.right,lvl+1);
        dfs2(node.left,lvl+1);
    }
}