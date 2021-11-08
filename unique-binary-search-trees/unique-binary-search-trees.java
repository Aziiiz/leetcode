class Solution {
    public int numTrees(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for(int i=3; i<n+1; i++) {
            for(int j=0; j<i; j++) {
                arr[i] += arr[j]*arr[i-1-j]; 
            }
        }
        return arr[n];
    }
}