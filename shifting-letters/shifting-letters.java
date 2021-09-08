class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder str = new StringBuilder();
        int move = 0;
        for(int i=0; i<shifts.length; i++) {
            move = (move+shifts[i]) % 26; 
        }    
        for(int j=0; j<s.length(); j++) {
            int index = s.charAt(j) - 'a';
            str.append((char) ((index + move)%26 + 97));            
            move = Math.floorMod(move - shifts[j],26);
            }
        return str.toString();
    }
}