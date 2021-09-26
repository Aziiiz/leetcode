class Solution {
    public String longestPalindrome(String s) {
       int n = s.length();
        boolean dp[][] = new boolean[n][n];
        int di = -1;
        int dj = -1;
        
        for(int i = 0; i<n; i++) {
            for(int j = 0, k=i; k<n; j++, k++) {
                if(i == 0) {
                    dp[j][k] = true;
                }else if(i == 1) {
                    if(s.charAt(j) == s.charAt(k)) {
                        dp[j][k] = true;
                    }else {
                        dp[j][k] = false;
                    }
                }else {
                  dp[j][k] = s.charAt(j) == s.charAt(k) && dp[j+1][k-1];  
                }
                
                
                if(dp[j][k] == true) {
                    di = j;
                    dj = k;
                }
            }
        }
        return s.substring(di, dj +1);
        
    }
}


//abb