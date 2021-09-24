class Solution {
    public int tribonacci(int n) {
        if(n==1 || n== 0) return n;
        if(n == 2) return 1;
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        for(int i=2; i<n; i++) {
            int l = f1 + f2 + f3;
            f1 = f2;
            f2 = f3;
            f3 = l;
        }
        return f3;
    }
}