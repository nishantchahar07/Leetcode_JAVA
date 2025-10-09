class Solution {
    public int helper(int[] nums, int goal){
        int st = 0;
        int end = 0;
        int sum = 0;
        int count = 0;
        while(end < nums.length){
            sum+=nums[end];           
            while(sum > goal && st <= end){
                sum-=nums[st];
                st++;
            }
             count+=end-st+1;
            end++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int c1 = helper(nums , goal);
        int c2 = helper(nums , goal-1);
        return c1-c2;
        
    }

}