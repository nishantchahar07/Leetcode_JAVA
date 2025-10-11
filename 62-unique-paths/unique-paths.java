class Solution {
    public int rasta(int cr , int cc , int er , int ec , int[][] strg){         
        if(cr > er || cc > ec) return 0;         
        if(cr == er && cc == ec) return 1;       

        if(strg[cr][cc] != 0) return strg[cr][cc]; 

        int right = rasta(cr , cc + 1 , er , ec , strg); 
        int down = rasta(cr + 1 , cc , er , ec , strg);   

        return strg[cr][cc] = right + down;              
    }

    public int uniquePaths(int m, int n) {
        int [][] strg = new int[m][n];
        return rasta(0 , 0 , m - 1 , n - 1, strg);
    }
}