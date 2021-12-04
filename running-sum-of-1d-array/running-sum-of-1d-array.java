class Solution {
    public int[] runningSum(int[] nums) {
        int[] n = new int[nums.length];
        int sum =0;
        for(int i=0; i<nums.length; i++) {
            n[i] = nums[i] + sum;
            sum = n[i];
        }
        return n;
    }
}