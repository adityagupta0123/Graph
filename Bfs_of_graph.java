class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(0);
        while(!q.isEmpty()){
            int cur = q.remove();
            if(!vis[cur]){
                ans.add(cur);
                vis[cur] = true;
                for(int i = 0; i < adj.get(cur).size(); i++){
                    int e = adj.get(cur).get(i);
                    q.add(e);
                }
            }
        }
        
        return ans;
    }
}
