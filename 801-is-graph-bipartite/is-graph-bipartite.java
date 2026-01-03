class Solution {
    class Bipartite{
        int vtx;
        int dist;
        public Bipartite(int vtx ,  int dist){
            this.vtx =  vtx;
            this.dist =  dist;
        }
    }

    public boolean isBipartite(int[][] graph) {
        HashMap<Integer , Integer> visited = new HashMap<>();
        Queue<Bipartite> q =  new LinkedList<>();
        // now apply BFS
        for(int i = 0 ; i < graph.length ; i++){
            if(visited.containsKey(i))continue;
            q.add(new Bipartite(i , 0));
            while(!q.isEmpty()){
            Bipartite rv =  q.poll();
            if(visited.containsKey(rv.vtx)){
                if(rv.dist != visited.get(rv.vtx))return false;
                else continue;
            }
            visited.put(rv.vtx ,  rv.dist);
            for(int nbrs : graph[rv.vtx]){
               if(!visited.containsKey(nbrs)){
                Bipartite np =  new Bipartite(nbrs ,  rv.dist+1);
                q.add(np);
               } 
            }

            
            }
            
        }
        return true;
    }
}