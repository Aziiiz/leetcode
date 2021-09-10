class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int i=0;
        int result =0;
        Set<Character> set = new HashSet<Character>();
        while(j<s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                result = Math.max(result, set.size());
            }else {
                set.remove(s.charAt(i++));
            }          
    }
        return result;

  }
}