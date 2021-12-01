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
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++) {
            map.put(inorder[i], i);
        }
        return helper(inorder, 0, n, postorder, 0, n, map);
    }
    
    private TreeNode helper(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd, Map<Integer,Integer> map) {
        int n = iEnd - iStart;
        if(n == 0) return null;
        int val = postorder[pEnd-1];
        int index =map.get(val);
        int pIndex = index+pStart-iStart;
        if(n == 1) return new TreeNode(val);
        return new TreeNode(val, helper(inorder, iStart, index,postorder, pStart, pIndex, map),
                           helper(inorder, index+1, iEnd, postorder, pIndex, pEnd-1, map));
    }
}