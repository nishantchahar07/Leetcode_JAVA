class Solution {

    public int get(int[] nums, int[] arr) {

    
        if (nums.length == 1) return nums[0];

       
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {

            int rob = nums[i] + arr[i - 2];
            int notRob = arr[i - 1];

            arr[i] = Math.max(rob, notRob);
        }

        return arr[nums.length - 1];
    }

    public int rob(int[] nums) {
        int[] arr = new int[nums.length];
        return get(nums, arr);
    }
}
