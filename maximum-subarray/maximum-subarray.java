class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSub = nums[0];
        int subArr = 0;
        for(int i=0; i<nums.length; i++) {
            if(subArr < 0) {
                subArr = 0;
            }
            subArr =subArr + nums[i];
            maxSub = Math.max(maxSub, subArr);    
        }
     return maxSub;   
    }
}