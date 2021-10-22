class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums2.length; i++) {
                map.put(nums2[i], i);
        }
        int[] answ = new int[nums1.length];
        for(int j =0; j<nums1.length; j++) {
                int n = map.get(nums1[j])+1;
                answ[j] = -1;
                while(n<nums2.length) {
                    if(nums2[n] > nums1[j]) {
                      answ[j] = nums2[n];
                      break;  
                    }else {
                        n++;
                    }
                }
        }
        return answ;
    }
}