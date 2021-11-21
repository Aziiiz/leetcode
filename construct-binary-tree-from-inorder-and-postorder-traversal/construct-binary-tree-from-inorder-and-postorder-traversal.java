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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n= inorder.length;
        return helper(inorder, 0, n, postorder, 0, n);
    }
    
    private TreeNode helper(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
        int n = iEnd - iStart;
        if(n == 0) return null;
        int val = postorder[pEnd-1];
        int index =0;
        int pIndex = 0;
        if(n == 1) return new TreeNode(val);
        for(int i=0; i<iEnd; i++) {
            if(inorder[i] == val) {
                index = i;
                pIndex = i + pStart - iStart;
                break;
            }
        }
        return new TreeNode(val, helper(inorder, iStart, index,postorder, pStart, pIndex),
                           helper(inorder, index+1, iEnd, postorder, pIndex, pEnd-1));
    }
}