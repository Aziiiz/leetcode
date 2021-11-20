class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0) return n ==1 ? n : -1;
        int[] counter = new int[n+1];
        for(int i=0; i<trust.length; i++) {
                counter[trust[i][0]]--;
                counter[trust[i][1]]++;
        }
        
        for(int i=0; i<counter.length; i++) {
            if(n == counter[i]+1) return i;
        }
        return -1;
    }
}