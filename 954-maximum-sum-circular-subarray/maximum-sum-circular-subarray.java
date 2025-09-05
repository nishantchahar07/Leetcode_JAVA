class Solution {
     public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            sum = sum+nums[i];
            ans = Math.max(ans ,  sum);
            if(sum < 0){
                sum  = 0;
            }
        }
        return ans;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int TSUM = 0;
        for(int i : nums){
            TSUM+=i;
        }
        
        int sum =nums[0];
        int minSum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            sum = Math.min(sum+nums[i] , nums[i]);
            minSum = Math.min(minSum , sum);
        }
        if(maxSubArray(nums) > 0){
        return Math.max( maxSubArray(nums),TSUM-minSum);
        }
        else return maxSubArray(nums);
    }
}