class Solution {
    public int numIslands(char[][] grid) {
        
        
        int row  = grid.length;
        int col = grid[0].length;
        int res = 0;
        boolean[][]  isChecked = new boolean[grid.length][grid[0].length];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(!isChecked[i][j] && grid[i][j] == '1'){
                  dfs(grid, i, j, isChecked);
                  res++;  
                } 
            }
        }
        return res;
        
        
    }
    
    public void dfs(char[][] grid, int i, int j, boolean[][] isChecked) {                
        int row  = grid.length;
        int col = grid[0].length;
        if(i<0 || j<0 || i > row-1 || j> col-1 || isChecked[i][j] || grid[i][j] != '1') return;
         
        isChecked[i][j] = true;    
        dfs(grid, i+1, j, isChecked);
        dfs(grid, i-1, j, isChecked);
        dfs(grid, i, j+1, isChecked);
        dfs(grid, i, j-1, isChecked);
    }
}