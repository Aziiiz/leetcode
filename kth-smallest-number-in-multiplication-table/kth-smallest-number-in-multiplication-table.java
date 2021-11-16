class Solution {
    public int findKthNumber(int m, int n, int k) {
        
        int low = 0;
        int high = m * n + 1;
        while(low< high) {
            int mid = low + (high -low)/2;
            int c = helper(mid, m, n);
            if(c>=k) high = mid;
            else low = mid +1;
            
        }
        return high;
    }
    
    private int helper(int mid, int m, int n) {
        int counter = 0;
        for(int i=1; i<=m; i++) {
            counter+= Math.min(mid/i, n);
        }
        return counter;
    }
}