class Solution {
    public void reverseString(char[] s) {
        int z = s.length -1;
        for(int i=0; i<s.length; i++) {

            char l = s[i];
            s[i] = s[z];
            s[z] = l;
            z--;
            if(z == i) {
                break;
            }else if(z==i+1){
                break;
            }
        }
    }
}
