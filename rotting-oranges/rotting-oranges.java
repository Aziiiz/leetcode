class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid ==null || grid.length ==0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if(fresh == 0) return 0;
        int count =-1;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()) {
            ++count;
            int size = queue.size();
            for(int k=0; k<size; k++){
            int[] q = queue.poll();
            for(int dir[] : dirs) {
                int x = q[0] + dir[0];
                int y = q[1] + dir[1];
                
                if(0>x || 0>y || x>=row || y>=col || grid[x][y] == 2 || grid[x][y] == 0) continue;
                
                grid[x][y] = 2;
                queue.offer(new int[]{x, y});
                --fresh;
            }
          }
        }
        return fresh ==0 ? count :-1;
    }
}
