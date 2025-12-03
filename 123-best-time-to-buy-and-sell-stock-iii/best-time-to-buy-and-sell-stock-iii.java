class Solution {
    public int getprofit(int idx , int buy , int[] arr , int[][][]dp , int limit ){
        if(idx ==  arr.length)return 0;
        if(limit  == 0 )return 0;
        if(dp[idx][buy][limit] != -1)return  dp[idx][buy][limit];
        int profit  = 0;
        if(buy == 1){
            int buykaro = -arr[idx] + getprofit(idx+1 ,  0  ,  arr ,dp ,limit );
            int mattkaro = 0 + getprofit(idx+1 ,  1  ,  arr ,dp ,limit );
            profit = Math.max(buykaro , mattkaro);
        }
        else{
                  int sellkaro = arr[idx] + getprofit(idx+1 ,  1  ,  arr ,dp ,limit-1);
                    int mattkaro = 0 + getprofit(idx+1 ,  0 ,  arr ,dp ,limit);
                profit = Math.max(sellkaro , mattkaro);
        }

        return dp[idx][buy][limit] = profit;

    }
    public int maxProfit(int[] prices) {

        int[][][] dp = new int[prices.length][2][3];
        for(int[][] i : dp){
            for(int [] arr : i){
            Arrays.fill(arr ,  -1);
        }
        }
        //getprofit(idx, buy/don'tBuy , prices)
       return  getprofit( 0  ,  1 , prices , dp , 2 );

          }
}