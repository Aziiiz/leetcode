class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] diff = new int[26];
        for(int i=0; i<word1.length(); i++) {
            diff[word1.charAt(i) - 'a']++;
            diff[word2.charAt(i) - 'a']--;
        }
        
        for(int j=0; j<26; j++) {
            if(diff[j] >= 4) return false;
            else if(diff[j] <= -4) return false;
        }
        return true;
    }
}