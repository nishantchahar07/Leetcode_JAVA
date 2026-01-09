class Solution {
    public int get(String str1 , String str2 , int i , int j , int[][]dp){
        if(i >= str1.length() || j >= str2.length())return 0;
        if(dp[i][j] != -1)return dp[i][j] ;
        int ans  = 0;
        if(str1.charAt(i) == str2.charAt(j)){
           ans =  1+get( str1 ,  str2 ,  i+1 ,  j+1 , dp);
           dp[i][j] = ans ;
        }
        else{
            int a = get( str1 ,  str2 ,  i+1 ,  j , dp);
            int b =  get( str1 ,  str2 ,  i ,  j+1 , dp);
            ans =  Math.max(a,b);
            dp[i][j] = ans;
        }
        return ans;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] i : dp){
            Arrays.fill(i , -1);
        }
        return get(text1 , text2 ,0,0 , dp);
    }
}