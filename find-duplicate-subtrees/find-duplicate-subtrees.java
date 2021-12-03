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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Map<String, Integer> serializeMap = new HashMap<>(); // serializ for the root and its freq
        serialize(root, res, serializeMap);
        return res;
    }
    
    private String serialize(TreeNode node, List<TreeNode> res, Map<String, Integer> serializeMap) {
        if(node == null) return "#";
        StringBuilder sb = new StringBuilder();
        
        sb.append(serialize(node.left, res, serializeMap)).append(",");
        sb.append(serialize(node.right, res, serializeMap)).append(",");
        sb.append(node.val);
        
        String str = sb.toString();
        
        serializeMap.put(str, serializeMap.getOrDefault(str, 0) + 1);
        if(serializeMap.get(str) == 2) res.add(node);
        
        return str;
    }
}