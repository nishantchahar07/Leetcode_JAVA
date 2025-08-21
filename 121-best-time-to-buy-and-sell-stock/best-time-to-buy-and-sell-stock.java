class Solution {
    public int maxProfit(int[] prices) {
        int n =  prices.length;
    
    int[]pre =  new int[n];    
    int[]suf  =  new int[n];
    int ans = 0;
    pre[0] = prices[0];
    suf[n-1] = prices[n-1];

    for(int i = 1; i  < n ; i++){
        pre[i]= Math.min(prices[i] , pre[i-1]);
    }
    
    for(int i = n-2; i  >= 0 ; i--){
        suf[i]= Math.max(prices[i] , suf[i+1]);
    }
    for(int i = 0 ; i < n ; i++){
        ans = Math.max(ans , suf[i]-pre[i]);
    }
    return ans;
    }
}