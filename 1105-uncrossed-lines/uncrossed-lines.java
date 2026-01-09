class Solution {
    public int get(int[] nums1 , int[] nums2 , int i , int j, int[][] dp){
        if(i >= nums1.length || j >= nums2.length )return 0;
         if(dp[i][j] != -1)return dp[i][j] ;
        int ans = 0;
            if(nums1[i] == nums2[j]){
                ans = 1+get( nums1 ,  nums2 , i+1 , j+1 , dp);
               
            dp[i][j] = ans;
            }
            else{
                int a = get( nums1 ,  nums2 , i+1 , j , dp);
                int b =  get( nums1 ,  nums2 , i , j+1 , dp);
                ans =  Math.max(a,b);
            dp[i][j] = ans;
            }
            return ans;
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        for(int[] i : dp){
            Arrays.fill(i , -1);
        }
        return get(nums1 ,  nums2 ,  0 , 0, dp);
    }
}