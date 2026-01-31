class Solution {
    // class Pair{
    //     int a;
    //     int b;
    //     public Pair(int a  , int b){
    //         this.a = a;
    //         this.b = b;
    //     }
    // }
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        // PriorityQueue<Pair> pq= new PriorityQueue<>((a,b) -> a.b == b.b ? a.a - b.a :  a.b - b.b);
        // int count = 0;
        // for(int i = 0 ; i < arr.length-1 ; i++){
        //     if(arr[i+1][0] < arr[i][1] ){
        //         count++;
        //         if(arr[i+1][1] >= arr[i][1] ){
        //         arr[i+1][0] =  arr[i][0];
        //         arr[i+1][1] =  arr[i][1];
        //     }

        // }
        // }
        //    return count ;

        int cnt = 0;
        int pre = Integer.MIN_VALUE;
        for (int[] ar : arr) {
            int a = ar[0];
            int b = ar[1];
            if(a < pre){
                cnt++;
            }
            else{
                pre = b;
            }
        }
        return cnt;
    }
}