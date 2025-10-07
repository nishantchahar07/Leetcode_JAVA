class Solution {
    public static int robbery(int[] nums ,  int i , int[] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1){
            return dp[i];
        }

        int chori = nums[i]+robbery(nums , i+2 , dp);
        int nochori =  robbery(nums , i+1 , dp);
        return dp[i] =  Math.max(chori , nochori);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp , -1);
      return  robbery(nums , 0 , dp);
    }
}