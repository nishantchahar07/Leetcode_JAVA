class Solution {
    HashMap<String, Integer> map = new HashMap<>();

    // public int unique(int cc , int cr , int er , int ec , int[][]arr , int[][]dp){
    public int unique(int cc, int cr, int er, int ec, int[][] arr) {

        if (cr == er && cc == ec)
            return 1;
        if (cr > er || cc > ec)
            return 0;
        if (arr[cr][cc] == 1)
            return 0;
        // if (dp[cr][cc] != -1)
        //     return dp[cr][cc];
        String key  = cr+"-"+cc;
        if(map.containsKey(key)){
            return map.get(key);
        }
        // int bottom = unique(cc, cr + 1, er, ec, arr, dp);
        // int right = unique(cc + 1, cr, er, ec, arr, dp);
        // return dp[cr][cc] = bottom + right;
        int bottom = unique(cc, cr + 1, er, ec, arr);
        int right = unique(cc + 1, cr, er, ec, arr);
        int ans  = bottom+right;
        map.put(key,ans);
        return ans;
    }

    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        // int[][]dp =  new int[m][n];
        // for(int i = 0 ; i < m ; i++){
        //     Arrays.fill(dp[i] , -1);
        // }

        if (arr[m - 1][n - 1] == 1 || arr[0][0] == 1)
            return 0;
        // return unique(0, 0, m-1, n-1, arr , dp);
        return unique(0, 0, m - 1, n - 1, arr);
    }
}