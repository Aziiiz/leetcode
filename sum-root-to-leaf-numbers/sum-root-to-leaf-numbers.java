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
    public int sumNumbers(TreeNode root) {
        return dfsHelper(root, 0);
    }
    private int dfsHelper(TreeNode node, int curVal) {
        if(node == null) {
            return 0;
        }
        curVal = curVal * 10 + node.val;
        if(node.right == null && node.left == null) {
            return curVal;
        }
        return dfsHelper(node.left, curVal) + dfsHelper(node.right, curVal);
    }
}