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
    public boolean isValidBST(TreeNode root) {
        long left = Long.MIN_VALUE;
        long right = Long.MAX_VALUE;
        return helper(root, left, right);
    }
    private boolean helper(TreeNode root, long left, long right) {
        if(root == null) return true;
        
        if(root.val >= right || root.val <= left) return false;
        
        return helper(root.left, left, (int) root.val) && helper(root.right, (int) root.val, right);
    }
}