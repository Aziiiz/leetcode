class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0) return n ==1 ? n : -1;
        int[] counter = new int[n+1];
        int result=0;
        int resultValue=0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<trust.length; i++) {
             set.add(trust[i][0]);
             counter[trust[i][1]] +=1;
            
            if(resultValue < counter[trust[i][1]]) {
                resultValue = counter[trust[i][1]];
                result = trust[i][1];
            }
        }
        
        if(n == resultValue+1 && !set.contains(result)) return result;
        return -1;
        
        
    }
}