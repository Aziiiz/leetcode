class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<nums2.length; i++) {
            if(map.containsKey(nums2[i])) {
                map.put(nums2[i], map.get(nums2[i]) + 1);
            }else {
                map.put(nums2[i], 1);
            }
        }
        
        for(int j=0; j<nums1.length; j++) {
            if(map.containsKey(nums1[j]) && map.get(nums1[j]) > 0) {
                list.add(nums1[j]);
                map.put(nums1[j], map.get(nums1[j]) -1);
            }
        }
        int[] ret = new int[list.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = list.get(i).intValue();
        }
        return ret;
    }
}