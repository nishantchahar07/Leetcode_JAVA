class Solution {
    public int findPeakElement(int[] nums) {
        int st = 0;
        int end = nums.length - 1;

        if (nums.length == 1) return 0;
        if (nums.length == 2) return nums[0] > nums[1] ? 0 : 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (mid > 0 && mid < nums.length - 1) {
                if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) return mid;
                else if (nums[mid] < nums[mid + 1]) st = mid + 1;
                else end = mid - 1;
            }
            
            else if (mid == 0) {
                return nums[0] > nums[1] ? 0 : 1;
            }
           
            else {
                return nums[nums.length - 1] > nums[nums.length - 2] ? nums.length - 1 : nums.length - 2;
            }
        }
        return -1;
    }
}
