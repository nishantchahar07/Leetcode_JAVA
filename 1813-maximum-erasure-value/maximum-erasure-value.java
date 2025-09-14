class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set =  new HashSet<>();
        int st = 0;
        int end = 0;
        int max = 0;
        int ans = 0;
        while(end < nums.length){
            
            ans += nums[end];
            while( set.contains(nums[end])){
                set.remove(nums[st]);
                ans -= nums[st];
                st++;

            }
            set.add(nums[end]);
          max = Math.max(ans, max);
            end++;
          
            }
              return max;
        }
      
    }
