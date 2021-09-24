class Solution {
    public String reverseVowels(String s) {
        int z = s.length() -1;
        Set<Character> set = new HashSet<Character>();
        char[] tempChar = s.toCharArray();
        // 'a', 'e', 'i', 'o', and 'u'
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int i = 0;
        while(z > i) {
            if(set.contains(tempChar[i]) && set.contains(tempChar[z])) {
               char temp = tempChar[i];
               tempChar[i] = tempChar[z];
               tempChar[z] = temp;
               i++;
               z--;
            }else if (set.contains(tempChar[i]) && !set.contains(tempChar[z])) {
                z--;
            }else if (!set.contains(tempChar[i]) && set.contains(tempChar[z])) {
                i++;
            }else {
                i++;
                z--;
            }
        }
        return new String(tempChar);
    }
}