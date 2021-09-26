class Solution {
    public boolean isPalindrome(String s) {
      String s1 = s.replaceAll("[^a-zA-Z0-9]+", ""); 
      s1 = s1.toLowerCase().replaceAll(" ", ""); 
      int i = 0;
      int j = s1.length() -1;
      while(j>= i) {
          if(s1.charAt(i) != s1.charAt(j)) {
              return false;
          }
          j--;
          i++;
      }
      return true;  
    }
}