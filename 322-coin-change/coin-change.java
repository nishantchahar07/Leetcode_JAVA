class Solution {
  public int get(int[] coins, int amount, int i , int[][]dp) {

    if (amount == 0) return 0;   
    if (amount < 0 || i >= coins.length) return (int)(1e9);
    if(dp[amount][i] != -1)return dp[amount][i];
      int take = 1+get(coins, amount - coins[i], i , dp);
    int skip = get(coins, amount, i + 1 , dp);
    return dp[amount][i] = Math.min(take , skip);
}



    public int coinChange(int[] coins, int amount) {   
        int[][] dp =  new int[amount+1][coins.length+1];
        for(int[] i : dp){
             Arrays.fill(i , -1);
        }

        int ans =  get(coins ,  amount ,0  , dp);
        return ans == (int)(1e9) ? -1 : ans;

    }
}