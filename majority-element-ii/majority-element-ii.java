class Solution {
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> list = new ArrayList<Integer>();
      Map<Integer, Integer> map = new HashMap<Integer,Integer>();
      for(int i=0; i<nums.length; i++) {
          if(map.containsKey(nums[i]) && map.get(nums[i]) > 0) map.put(nums[i], map.get(nums[i])+1);
          else if (!map.containsKey(nums[i])) map.put(nums[i], 1);
          
          if(map.get(nums[i]) > nums.length/3) {
              list.add(nums[i]);
              map.put(nums[i], 0);
          }
      }
        return list;
    }
}