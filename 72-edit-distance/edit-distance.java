class Solution {
    public int editDistance(String s1, String s2, int vidx1, int vidx2 , int[][]dp) {
        if (vidx1 == s1.length() && vidx2 == s2.length()) return 0;
        if (vidx1 == s1.length()) return s2.length() - vidx2;
        if (vidx2 == s2.length()) return s1.length() - vidx1;
        if(dp[vidx1][vidx2] != -1)return  dp[vidx1][vidx2];

        
        if (s1.charAt(vidx1) == s2.charAt(vidx2)) {
            return dp[vidx1][vidx2] =  editDistance(s1, s2, vidx1 + 1, vidx2 + 1,  dp);
        }

        int insert = 1 + editDistance(s1, s2, vidx1, vidx2 + 1 , dp);
        int delete = 1 + editDistance(s1, s2, vidx1 + 1, vidx2 , dp);
        int replace = 1 + editDistance(s1, s2, vidx1 + 1, vidx2 + 1 , dp);

        return dp[vidx1][vidx2] = Math.min(insert, Math.min(delete, replace));
    }

    public int minDistance(String word1, String word2) {
        int[][] dp=  new int[word1.length()][word2.length()];
        for(int i = 0 ; i < word1.length() ; i++){
            Arrays.fill(dp[i] , -1);
        }
        return editDistance(word1, word2, 0, 0 , dp);
    }
}
