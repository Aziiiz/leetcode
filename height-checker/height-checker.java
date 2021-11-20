class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        for(int i=0; i<heights.length; i++) {
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);
        int result = 0;
        for(int i=0; i<heights.length; i++) {
            if(heights[i] != sorted[i]) result++;
        }
        return result;
    }
}