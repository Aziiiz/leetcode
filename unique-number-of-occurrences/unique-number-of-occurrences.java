class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) +1);
            }else {
                map.put(arr[i], 1);
            }
        }
        for(var entry: map.entrySet()) {
            if(set.contains(entry.getValue())) return false;
            set.add(entry.getValue());
        }
        return true;
        
    }
}