class Solution {
    public int seq(String txt1 , String txt2 , int vidx1  , int vidx2 , int[][]dp){
        if(txt1.length() == vidx1 || txt2.length() == vidx2)return 0;
        if(dp[vidx1][vidx2] != -1)return dp[vidx1][vidx2];
        
        if(txt1.charAt(vidx1) == txt2.charAt(vidx2)){
            int equal = seq(txt1, txt2 , vidx1+1 , vidx2+1 , dp);
            return dp[vidx1][vidx2] = equal+1;
        } 
        else{
            int left =  seq(txt1, txt2 ,  vidx1+1 ,  vidx2  , dp);
            int right  = seq(txt1, txt2 ,  vidx1 ,  vidx2+1 , dp );
            return dp[vidx1][vidx2] = Math.max(left, right);
        } 
        
    }
    public int longestCommonSubsequence(String text1, String text2) {

        int[][]dp = new int[text1.length()+1][text2.length()+1];
      for (int i = 0; i < text1.length() + 1; i++) {
    Arrays.fill(dp[i], -1);
}

        return seq(text1 , text2 , 0 , 0 ,dp);

    }
}