class Solution {
    public int minStartValue(int[] nums) {
        int minval = 0;
        int total = 0;
        for(int i=0; i<nums.length; i++) {
            total +=nums[i];
            minval = Math.min(minval, total);
        }
        
        return -minval + 1;
    }
}