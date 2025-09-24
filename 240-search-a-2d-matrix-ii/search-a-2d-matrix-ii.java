class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int st  =  m-1;
        int end = 0;
        while(end < n && st>=0){
            if(arr[st][end]== target)return true;
            else if(arr[st][end] > target) st--;
            else end++;
        }
        return false;
    }
}