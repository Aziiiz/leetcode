class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m+1][n+1];
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
        return helper(0, 0,m, n, dp,  obstacleGrid);
    }
    
    private int helper(int i, int j, int m, int n, int[][] dp, int[][] obstacleGrid) {
        if(i== m-1 && j == n-1) return 1;
        if(i>m-1 || j> n-1) return 0;
        if(obstacleGrid[i][j] == 1) return 0;
        if(dp[i][j] != 0) return dp[i][j]; 
        dp[i][j] = helper(i+1,j, m, n, dp, obstacleGrid) + helper(i, j+1, m, n,dp, obstacleGrid);
        return dp[i][j];
    }
}