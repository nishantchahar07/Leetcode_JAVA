class Solution {
    public int get(int[] coins, int amount, int i , int[][]dp) {

    if (amount == 0) return 1;   
    if (amount < 0 || i >= coins.length) return 0;
    if(dp[amount][i] != -1)return dp[amount][i];
      int take = get(coins, amount - coins[i], i , dp);
    int skip = get(coins, amount, i + 1 , dp);
    return dp[amount][i] = take+skip;
}

    public int change(int amount, int[] coins) {
        int[][] dp =  new int[amount+1][coins.length+1];
        for(int[] i : dp){
             Arrays.fill(i , -1);
        }

        return  get(coins ,  amount ,0  , dp);
    

    }
}