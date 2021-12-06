class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i])+1);
            else map.put(nums[i], 1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans += entry.getValue() * (entry.getValue()-1)/2;
        }
        return ans;
    }
}