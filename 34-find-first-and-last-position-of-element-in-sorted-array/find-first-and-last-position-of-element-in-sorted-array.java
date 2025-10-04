class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st = 0;
        int end  = nums.length-1;
        int ans = -1;
        int[] arr =  new int[2];
         while(st <= end){
                int mid =  st + (end-st)/2;                
                if(nums[mid] >= target ){
                     if(nums[mid] == target)
                     ans =  mid;
                    end =  mid-1;
                }
                else{
                    st =  mid + 1;

                }
        }
        arr[0] =  ans;
         st = 0;
        end  = nums.length-1;
        ans = -1;
       
         while(st <= end){
                int mid =  st + (end-st)/2;                
                if(nums[mid] <= target ){
                    if(nums[mid] == target)
                     ans =  mid;
                    st =  mid+1;
                }
                else{
                    end =  mid - 1;

                }
        }
        arr[1] =  ans;
        return arr;
    }
}