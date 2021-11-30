

class Solution {
    
    static class Edge {
        int l;
        int e;
        Edge(int l, int e) {
            this.l = l;
            this.e = e;
        }
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
        
        ArrayList<Edge>[] list = new ArrayList[n];
        for(int i=0; i<n; i++) {
            list[i] = new ArrayList<Edge>();
        }
        
        
        for(int i=0; i<edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            Edge e1 = new Edge(v1, v2);
            Edge e2 = new Edge(v2, v1);
            list[v1].add(e1);
            list[v2].add(e2);
        }
        boolean[] dp = new boolean[n];
        return helperDfs(list, start, end, dp);
    }
    public boolean helperDfs(ArrayList<Edge>[] list, int start, int end, boolean[] dp) {
        
        dp[start] = true;
        if(start == end) {
            return true;
        }
        
        for(Edge e:  list[start]) {
            if(!dp[e.e]) {
                boolean valid = helperDfs(list, e.e, end, dp);
                if(valid) return true;
            }
            
        }
        return false;
    }
}