class Solution {
    public int searchInsert(int[] arr, int target) {
        int i = 0;
        int j = arr.length -1;
        int ans = arr.length;
        while(i <= j){
            int mid =  i + (j-i)/2;
            if(arr[mid] < target)i =  mid+1;
            else{
                ans = mid;
                j = mid-1;
            }
        }
        return ans;
    }
}