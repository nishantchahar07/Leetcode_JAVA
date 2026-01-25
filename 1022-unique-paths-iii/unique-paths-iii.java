class Solution {

    int total = 0;

    public int dfs(int[][] grid, int i, int j, int visited) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1)
            return 0;

        if (grid[i][j] == 2) {
            return visited == total ? 1 : 0;
        }

        int temp = grid[i][j];
        grid[i][j] = -1;

        int paths = 0;
        paths += dfs(grid, i + 1, j, visited + 1);
        paths += dfs(grid, i - 1, j, visited + 1);
        paths += dfs(grid, i, j + 1, visited + 1);
        paths += dfs(grid, i, j - 1, visited + 1);

        grid[i][j] = temp;

        return paths;
    }

    public int uniquePathsIII(int[][] grid) {

        int si = 0, sj = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != -1) total++;
                if (grid[i][j] == 1) {
                    si = i;
                    sj = j;
                }
            }
        }

        return dfs(grid, si, sj, 1);
    }
}
