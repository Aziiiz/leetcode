class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length < 3) return list;
        Arrays.sort(nums);
        for(int i=0; i<nums.length -2; i++) {
        if(i==0 || (i>0 && nums[i] != nums[i-1])) {    
        int j = i+1;
        int k = nums.length -1;
        int sum = 0 - nums[i];    
        while(j < k) {
            if(nums[j]+ nums[k] == sum) {
                List<Integer> childList = new ArrayList<Integer>();
                childList.add(nums[i]);
                childList.add(nums[j]);
                childList.add(nums[k]);
                list.add(childList);
                while(j < k && nums[j] == nums[j+1]) j++;
                while(j< k && nums[k] == nums[k-1]) k--;
                 j++;
                 k--;  
            } else if(nums[j]+ nums[k] > sum) {
                k--;
            }else  {
                j++;
            }
         }
        }
        }
        return list;
    }
}