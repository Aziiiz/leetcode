class Solution {
    public String reverseOnlyLetters(String s) {
        int z = s.length() - 1;
        int i = 0;
        char[] tempChar = s.toCharArray();
        while(z >= i) {
            if(Character.isLetter(tempChar[z]) &&  Character.isLetter(tempChar[i])) {
               char temp = tempChar[i];
               tempChar[i] = tempChar[z];
               tempChar[z] = temp;
               i++;
               z--; 
            }else if(!Character.isLetter(tempChar[z]) &&  Character.isLetter(tempChar[i])) {
                z--;
            }else if(Character.isLetter(tempChar[z]) &&  !Character.isLetter(tempChar[i])) {
                i++;
            }else {
                i++;
                z--;
            }
        }
        return new String(tempChar);
    }
}