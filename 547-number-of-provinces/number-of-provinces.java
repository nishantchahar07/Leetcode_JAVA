class Solution {
    public void dfs(int src, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[src] = true;
        for (int i : adj.get(src)) {
            if (!visited[i]) {
                dfs(i, adj, visited);
            }
        }

    }

    public int findCircleNum(int[][] Conn) {
        int n = Conn.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < Conn.length; i++) {
            adj.add(new ArrayList<>());
        }

        // change the adj matrix to adj list 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Conn[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        // now apply dfs/bfs for all nodes
        boolean[] visited = new boolean[n];
        ArrayList<Integer> ll = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, adj, visited);
            }
        }

        return count;
    }
}