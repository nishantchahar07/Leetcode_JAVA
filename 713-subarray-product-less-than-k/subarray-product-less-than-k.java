class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int st = 0;
        int end = 0;
        int product  = 1;
        int ans = 0;
        
      
        while(  end < nums.length){
            product*=nums[end];
             
            while(st <=  end && product >= k){
                product /=nums[st];
                st++;
            }
            if(product < k){
                 ans += end-st+1;
            }
          
            end++;

            
        }
        return ans;
    }

}