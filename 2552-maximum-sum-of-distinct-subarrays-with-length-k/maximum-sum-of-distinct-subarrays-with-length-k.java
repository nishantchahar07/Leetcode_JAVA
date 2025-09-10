class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        int st = 0;
        int end = 0;
        HashSet<Integer> st1 = new HashSet<>();
        long sum = 0;
        while(end < nums.length){
            int el = nums[end];
            while(st1.contains(el)){
                st1.remove(nums[st]);
                sum -= nums[st];
                st++;
            }
            st1.add(el);
            sum += el;
            if(st1.size() == k){
                ans = Math.max(ans, sum);
                st1.remove(nums[st]);
                sum -= nums[st];
                st++;
            }
            end++;
        }
        return ans;
    }
}
