class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for(int i=0; i<nums2.length; i++) {
                map.put(nums2[i], i);
                map2.put(i, nums2[i]);
        }
        int[] answ = new int[nums1.length];
        for(int j =0; j<nums1.length; j++) {
            if(map.containsKey(nums1[j]) && map2.containsKey(map.get(nums1[j])+1)) {
                int n = map.get(nums1[j]);
                n++;
                while(n<nums2.length) {
                    if(map2.get(n) > nums1[j]) {
                      answ[j] = map2.get(n);
                      break;  
                    }else {
                        n++;
                    }

                }
                if(answ[j] == 0) answ[j] = -1;
            }else {
                answ[j] = -1;
            }
        }
        return answ;
    }
}