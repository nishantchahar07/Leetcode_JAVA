class Solution {
    public boolean isodd(int i){
        if( i % 2 != 0)return true;
        else return false;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return helper(nums,k) - helper(nums,k-1);
    }
    public int helper(int[] nums, int k){
        int st = 0;
        int end = 0;
        int ans = 0;
        int count = 0;
        while(end < nums.length){
           if(isodd(nums[end]))
           count++  ; 
           while(count > k){
            if(isodd(nums[st])){
                st++;
                count--;
            }
            else st++;
           }
           end++;
            
        ans+=end-st+1;
        }
        return ans;
    }
}
