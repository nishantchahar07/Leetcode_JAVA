class Solution {
    public int maxProfit(int[] prices) {
        int n   = prices.length;
    
        int[] left  =  new int[n];
        int[] right = new int[n];
        left[0] =  prices[0];
        right[n-1] =  prices[n-1];

        for(int i = 1 ; i < n ; i++){
                if(prices[i] < left[i-1]){
                    left[i] = prices[i];
                }
                else{
                    left[i] =  left[i-1];
                }
        }
        for(int i = n-2 ;i >= 0 ; i--){
             if(prices[i]  > right[i+1]){
                    right[i] = prices[i];
                }
                else{
                    right[i] =  right[i+1];
                }
        }

        int max = 0;
        for(int i = 0 ; i < n ; i++){
            if(max < (right[i] - left[i])){
                max = right[i] - left[i];
            }
        }
        
return max;
        

    }
}