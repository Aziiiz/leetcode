class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<magazine.length(); i++) {
            if(map.containsKey(magazine.charAt(i))) map.put(magazine.charAt(i), map.get(magazine.charAt(i)) +1);
            else map.put(magazine.charAt(i), 1);
        }
        
        for(int j=0; j<ransomNote.length(); j++) {
            if(!map.containsKey(ransomNote.charAt(j))) return false;
            if(map.get(ransomNote.charAt(j))> 1) map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j))-1);
            else map.remove(ransomNote.charAt(j));
        }
        return true;
    }
}