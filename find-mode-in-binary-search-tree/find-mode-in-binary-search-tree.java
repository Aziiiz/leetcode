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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        helper(root, map);
        List<Integer> list = new ArrayList<Integer>();
        int n = 0;
        int max = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                n = entry.getKey();
                max = entry.getValue();
            }
        }
        list.add(n);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == max &&  entry.getKey() !=  n) {
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) res[i] = list.get(i);
        return res;
        
        
    }
    
    private void helper(TreeNode root, Map<Integer,Integer> map) {
        if(root == null) return;
        
        if(map.containsKey(root.val)) map.put(root.val, map.get(root.val)+1);
        else map.put(root.val, 1);
        
        
        helper(root.left, map);
        helper(root.right, map);
    }
}