class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<String>();
        int[] w2 = helper("");
        for(int i=0; i<words2.length; i++){
            int[] s1 = helper(words2[i]);
            for(int j=0; j<26; j++){
                w2[j] = Math.max(w2[j], s1[j]);
            }
        }
        
        for(int i=0; i<words1.length; i++) {
            boolean isValid = true;
            int[] s1 = helper(words1[i]);
            for(int j=0; j<26; j++) {
                if(s1[j]< w2[j]) {
                       isValid = false;
                       break;
                }
            }
            if(isValid) list.add(words1[i]);
        }
        return list;
    }
    
    private int[] helper(String s) {
        int[] ans = new int[26];
        for(char c : s.toCharArray()) {
            ans[c- 'a']++;
        }
        return ans;
    }
}