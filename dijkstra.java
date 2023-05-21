

class Solution
{
    static class Pair implements Comparable<Pair>{
        int n ;
        int path;
        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int dist[] = new int[V];
        for(int i =0; i< V; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        boolean vis[] = new boolean[V];
        dist[S] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair (S, 0));
        while(!pq.isEmpty()){
            Pair cur = pq.remove();
            if(!vis[cur.n]){
                vis[cur.n] = true;
                
                for(int i =0; i< adj.get(cur.n).size(); i++){
                    int e = adj.get(cur.n).get(i).get(0);
                    int wt = adj.get(cur.n).get(i).get(1);
                    
                    if(dist[e]> dist[cur.n] + wt){
                        dist[e] = dist[cur.n] + wt;
                        pq.add(new Pair(e,dist[e]));
                    }
                }
            }
        }
        return dist;
    }
}
