class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];  // 1
        int b = edges[0][1];  // 2
        int c = edges[1][0];  // 2
        int d = edges[1][1];  // 3
        
        if(a == c || a == d ) return a;
        return b;
    }
}