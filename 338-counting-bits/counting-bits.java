class Solution {
    // public int get(int i ){

    // }
    public int[] countBits(int n) {
        int[] arr =  new int[n+1];
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] =  arr[i >> 1] + (i&1);
        }
        return arr;
    }
}