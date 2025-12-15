class Solution {
    public boolean get(int[] nums ,  int sum , int n , int count  , Boolean[][]dp ){
      if(dp[sum][n] != null)return dp[sum][n];
        if(count ==  sum)return true ;
        if(n == 0) return false;

        boolean add =  get(nums , sum-nums[n-1] , n-1 , count+nums[n-1] , dp);
        boolean not = get(nums , sum , n-1 , count , dp);

        return dp[sum][n] =  add || not;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        int n =  nums.length;
        Boolean[][]dp =  new Boolean[sum+1][n+1];
        for(Boolean[]i : dp){
            Arrays.fill(i , null);
        }
        return get(nums , sum ,  n , 0 ,dp );
        
    }
}