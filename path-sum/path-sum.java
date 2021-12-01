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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root, targetSum, 0);
    }
    private boolean sum(TreeNode root, int targetSum, int sum) {
        if(root == null) return false;
        sum+=root.val;
        
        if(root.left == null && root.right == null) return sum == targetSum;

        return sum(root.left, targetSum, sum) || sum(root.right, targetSum, sum);
        
    }
}