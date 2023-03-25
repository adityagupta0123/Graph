
class Solution {
    // Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
           ArrayList<ArrayList<Integer>> res=new ArrayList<>();
            for(int i=0;i<adj.size();i++){
                res.add(new ArrayList<Integer>());
            }
        for(int i=0;i<adj.size();i++){
            res.get(i).add(i);
            for(int j=0;j<adj.get(i).size();j++){
                res.get(i).add(adj.get(i).get(j));
            }
        }
        return res;
    }
}
