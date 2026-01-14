class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n = arr.length;
        int[][] dp =  new int[n][n];

        for(int c = 0 ; c < n ; c++ ){
            dp[0][c] = arr[0][c];
        }
       



        for(int row = 1 ; row < n ; row++){
            for(int c = 0 ; c < n ; c++){
                 int up = dp[row-1][c];
int left = (c > 0) ? dp[row-1][c-1] : (int)1e9;
int right = (c < n-1) ? dp[row-1][c+1] : (int)1e9;

int miniofuparwala = Math.min(up, Math.min(left, right));

                 
                miniofuparwala = Math.min( up,Math.min(left , right));

                dp[row][c] = arr[row][c] + miniofuparwala;
            }
        }
        int result =  (int)(1e9);
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            ans =  dp[n-1][i];
            result = Math.min(result , ans);
        }
    return result;
    }
}