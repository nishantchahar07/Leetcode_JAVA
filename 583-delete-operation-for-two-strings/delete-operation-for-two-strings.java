class Solution {
    public int delete(String s1 , String s2 , int vidx1 ,  int vidx2 , int[][]dp){
       if (vidx1 == s1.length() && vidx2 == s2.length()) return 0;
        if (vidx1 == s1.length()) return s2.length() - vidx2;
        if (vidx2 == s2.length()) return s1.length() - vidx1;
        if(dp[vidx1][vidx2] != -1)return  dp[vidx1][vidx2];

        

        if(s1.charAt(vidx1) == s2.charAt(vidx2)){
            return delete(s1 , s2, vidx1+1 , vidx2+1, dp);
        }
        int left = delete(s1 , s2, vidx1+1, vidx2, dp)+1;
        int right = delete(s1 , s2, vidx1 , vidx2+1, dp)+1;
        return dp[vidx1][vidx2] = Math.min(left ,  right);

    }
    public int minDistance(String word1, String word2) {
        int[][]dp =  new int[word1.length()+1][word2.length()+1];
        for(int i = 0 ; i < word1.length() ; i++){
            Arrays.fill(dp[i] , -1);
        }
       return  delete(word1 , word2 , 0 , 0 , dp);
    }
}