class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m =  arr.length;
        int n =  arr[0].length;
        int st = 0;
        int end = n-1;
        while(end >= 0 && st < m){
           if(arr[st][end] == target)return true;
           else if(arr[st][end] > target)end--;
           else{
            st++;
           }

        }  
        return false;  }
}