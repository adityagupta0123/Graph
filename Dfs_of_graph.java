
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    ArrayList<Integer> ans = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        dfs(adj, 0, new boolean[V]);
        return ans;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj, int cur, boolean vis[]){
        ans.add(cur);
        vis[cur] = true;
        
        for(int i =0; i< adj.get(cur).size() ; i++){
            int e = adj.get(cur).get(i);
            if(!vis[e]){
                dfs(adj, e, vis);
            }
        }
    }
}
