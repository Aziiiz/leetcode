class Solution {
    public String reverseWords(String s) {
       String [] split = s.split(" ");
        StringBuilder rev = new StringBuilder();
        for(String word : split){
            rev.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return rev.toString().trim();
    }
}