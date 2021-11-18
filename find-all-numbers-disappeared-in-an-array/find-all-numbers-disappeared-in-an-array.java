class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i=1; i<nums.length+1; i++) {
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}