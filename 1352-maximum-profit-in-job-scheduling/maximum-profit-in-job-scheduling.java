class Solution {
    static HashMap<Integer , Integer> map =  new HashMap<>();
    public int nextIndex(int[][]arr , int i , int currendidx){
        int n = arr.length;
        int j = n-1;

        int ans = n+1;

        while( i <= j){
            int mid =  i + (j-i)/2;

            if(arr[mid][0] >= currendidx){
                ans =  mid;
                j = mid-1;
            }
            else i =  mid+1;
        }
        return ans;


    }

    public int solve(int[][] arr , int i){
        if(i >= arr.length)return 0;
        int nextIdx = nextIndex(arr , i+1 , arr[i][1]  );
        if(map.containsKey(i))return map.get(i);

        int taken =  arr[i][2] + solve(arr ,  nextIdx);
        int nottaken =  solve(arr , i+1);
       int ans =  Math.max(taken , nottaken);
       map.put(i , ans);
       return ans;
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        map.clear();
        int[][] arr = new int[n][3];
        for(int i = 0 ; i < n ; i++){
            arr[i][0] =  startTime[i];
            arr[i][1] =  endTime[i];
            arr[i][2] =  profit[i];       

        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        return solve(arr , 0);

    }
}