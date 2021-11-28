class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        dfs(graph, result, list, 0);
        return result;
        
    }
    
    private void dfs(int[][] graph, List<List<Integer>> result, List<Integer> list, int index) {
        if(index == graph.length-1) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i: graph[index]) {
            list.add(i);
            dfs(graph, result, list, i);
            list.remove(list.size()-1);
        }
    }
}