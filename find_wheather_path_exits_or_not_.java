class Solution {
    public boolean validPath(int n, int[][] eg, int src, int dst) {
      List<List<Integer>> graph = buildGraph(n, eg);
       return dfs(graph, src, dst, new boolean[n]);
    }
    
    public boolean dfs(List<List<Integer>> graph, int src, int dst, boolean []vis){
        if(src == dst)
            return true;
        vis[src] = true;
        
        for(int i =0; i< graph.get(src).size(); i++){
            int e = graph.get(src).get(i);
            if(!vis[e] && dfs(graph, e, dst, vis))
                return true;
        }
        return false;
    }
    
    private List<List<Integer>> buildGraph(int n, int[][] edges) {
	   List<List<Integer>> graph = new ArrayList<>();

	    for(int i=0;i<n;i++) {
		  graph.add(new ArrayList<>());
	    }

	    for(int[] edge: edges) {
		  graph.get(edge[0]).add(edge[1]);
		  graph.get(edge[1]).add(edge[0]);
	     }

	    return graph;
     }

}
