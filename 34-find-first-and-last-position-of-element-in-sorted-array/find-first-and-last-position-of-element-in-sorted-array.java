class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = new int[]{-1, -1};
        if (arr.length == 0) return ans;

       
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == target) {
                ans[0] = mid;
                j = mid - 1; 
            } else if (arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        
        i = 0;
        j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == target) {
                ans[1] = mid;
                i = mid + 1; 
            } else if (arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return ans;
    }
}
