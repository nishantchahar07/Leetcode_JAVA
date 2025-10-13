class Solution {
    public int maze(int cc , int cr , int er , int ec , int[][]dp ){


        if(cr > er || cc > ec)return 0;
        if( cr ==  er &&cc == ec)return 1;
        if(dp[cr][cc] != 0)return dp[cr][cc];

        int right = maze(cc +1 , cr , er ,ec , dp);
        int bottom  = maze(cc , cr+1 , er ,ec , dp);
        return dp[cr][cc] =  right + bottom;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return maze(0 , 0 , m-1, n-1 ,  dp);

    }
}