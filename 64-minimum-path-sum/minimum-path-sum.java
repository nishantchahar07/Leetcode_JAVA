class Solution {
    public int get(int[][] grid ,  int cc , int cr , int m , int n , int[][]dp){
        if(cc >= m || cr >= n) return Integer.MAX_VALUE;
         if(cc == m-1&& cr == n-1) return grid[cc][cr];
         if(dp[cc][cr] != -1)return dp[cc][cr];
       
       int right =  get(grid , cc+1 , cr , m , n , dp);
       int bottom =  get(grid , cc , cr+1 , m , n , dp);
       return dp[cc][cr] =  grid[cc][cr] + Math.min(right , bottom);

    }
    public int minPathSum(int[][] grid) {
        
        int m =  grid.length;
        int n =  grid[0].length;
        int[][] dp =  new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i , -1);
        }
       return get(grid , 0 , 0 , m , n , dp);
    }
}