class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int result =0;
        Set<Character> set = new HashSet<Character>();
        while(i<s.length()) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                result = Math.max(result, set.size());    
            }else {
                set.remove(s.charAt(j++));
            }
        }
        return result;
  }
}
