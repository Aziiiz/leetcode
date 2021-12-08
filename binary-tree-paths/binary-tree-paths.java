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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        String str = String.valueOf(root.val);
        if(root.left == null && root.right == null){
            list.add(str);
            return list;
        } 
        str+="->";
        dfs(root.left, str, list);
        dfs(root.right, str, list);
        return list;
        
    }
    private void dfs(TreeNode root, String str, List<String> list) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            str +=String.valueOf(root.val);
            list.add(str);
        }
        str+= String.valueOf(root.val);
        str +="->";
        dfs(root.left, str, list);
        dfs(root.right, str, list);
    }
}