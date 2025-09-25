class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n =  nums.length;        
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int pi= 0;
        int ni = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                pos[pi] = nums[i];
                pi++;
            }
            else{
                neg[ni] = nums[i];
                ni++;
            }
        }
        pi =0;
        ni = 0;
        for(int i = 0 ; i < n ; i++){
            if(i%2 == 0){
                nums[i] = pos[pi];
                pi++;
            }
            else{
                nums[i] = neg[ni];
                ni++;
            }
        }

        return nums;
    }
}