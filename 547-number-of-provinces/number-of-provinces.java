class Solution {
    public int findCircleNum(int[][] Conn) {

        int n = Conn.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i]) continue;

            count++;
            q.add(i);

            while (!q.isEmpty()) {
                int val = q.poll();

                if (visited[val]) continue;
                visited[val] = true;

                for (int j = 0; j < n; j++) {
                    if (Conn[val][j] == 1 && !visited[j] && j != val) {
                        q.add(j);
                    }
                }
            }
        }
        return count;
    }
}
