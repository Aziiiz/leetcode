class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        int j=nums.length-2;
        right[nums.length-1] = nums[nums.length-1];
        for(int i=1; i<nums.length; i++) {
            left[i] = left[i-1] * nums[i];
            right[j] = right[j+1] * nums[j];
            j--;
        }
        ans[0] = right[1];
        ans[nums.length-1] = left[left.length-2];
        for(int i=1; i<nums.length-1; i++) {
            ans[i] = right[i+1] * left[i-1];
        }
        return ans;
    }
}