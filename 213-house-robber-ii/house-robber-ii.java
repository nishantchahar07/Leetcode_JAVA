class Solution {
    public static int robbery(int[] nums , int i , int n ,  int[] dp){
        if(i >= n) return 0;
        if(dp[i] != -1)return dp[i];
        int rob = nums[i] + robbery(nums , i+2 , n , dp);
        int norob = robbery(nums , i+1 , n , dp);
        return dp[i] = Math.max(rob , norob);
    }
    public int rob(int[] nums) {
        int n =  nums.length;
        int[] dp1 =  new int[n-1];   
         int[] dp2 =  new int[n];    
        Arrays.fill(dp1 , -1);
          Arrays.fill(dp2 , -1);
        if(n == 0)return 0;
        if(n == 1)return nums[0];
        int one = robbery(nums , 0 , n-1 , dp1);
        int two = robbery(nums , 1, n , dp2);
        return Math.max(one , two);
    }
}