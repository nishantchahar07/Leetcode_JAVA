class Solution {    

    public boolean get(int[] nums, int n, int target, Boolean[][] dp) {

        if(target == 0) return true;   // subset mil gaya
        if(n == 0) return false;       // items khatam

        if(dp[n][target] != null) return dp[n][target];

        boolean not = get(nums, n-1, target, dp);
        boolean add = false;

        if(nums[n-1] <= target) {
            add = get(nums, n-1, target - nums[n-1], dp);
        }

        return dp[n][target] = add || not;
    }

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(int i : nums) sum += i;

        if(sum % 2 != 0) return false;

        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length + 1][target + 1];

        return get(nums, nums.length, target, dp);
    }
}
