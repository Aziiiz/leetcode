class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int div = 0;
        for(int i=1; i<=nums[nums.length-1]; i++) {
            System.out.println(nums[0]%i+ " "+ i);
            if(nums[0]% i == 0 && nums[nums.length-1] % i ==0) div = Math.max(div, i);
        }
        return div;
    }
}