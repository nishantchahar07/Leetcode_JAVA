class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int maxArea =  0;
        while(left < right){
            maxArea = Math.max(maxArea , Math.min(arr[left] , arr[right])* (right-left));
            if(arr[left] < arr[right])left++;
            else right--;
        }
        return maxArea;
    }

}