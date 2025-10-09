class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int st = 0;
        int end = 0;
        int ans = 0;
        int max = 0;
        while(end < nums.length){
            int ch = nums[end];
            if(ch == 0){
                st = end;
                st++; 
            }
            ans = end-st+1;
            max =  (Math.max(ans , max));
            end++;
        }
return max;
    }
}