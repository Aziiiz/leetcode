class Solution {
    public int missingNumber(int[] nums) {
      int n = (nums.length) * (nums.length+1)/2;
       for(int i=0; i<nums.length; i++) {
           n = n - nums[i]; 
       }
        return n; 
    }
}
