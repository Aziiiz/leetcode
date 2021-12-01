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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, inorder, 0, n-1, 0, n-1, n);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int pStart, int pEnd, int iStart, int iEnd, int n) {
        if(pStart > pEnd || iStart > iEnd) return null;
        int val = preorder[pStart];
        int index = 0;
        int pIndex = 0;
        
        for(int i=0; i<n; i++) {
            if(inorder[i] == val) {
                index = i;
                pIndex = i  - iStart;
                break;
            }
        }
        
        return new TreeNode(val, helper(preorder, inorder, pStart+1, pStart+pIndex, iStart, index-1, n),
                           helper(preorder, inorder, pStart+pIndex+1, pEnd, index+1, iEnd, n));
    }
}