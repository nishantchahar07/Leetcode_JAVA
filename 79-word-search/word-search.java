class Solution {
    public boolean get(int i , int j , int idx , char[][] board , String word ){
        if(idx ==  word.length())return true;
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] == '#' )return false;
    
         if(board[i][j] != word.charAt(idx)) return false;
        int[][] dir =  {{1,0} , {0,1} , {-1 , 0} , {0, -1}};

        char val = board[i][j];
        board[i][j] = '#';
        for(int [] arr : dir){
           int  new_i = i + arr[0];
            int new_j = j + arr[1];
            if(get(new_i , new_j , idx+1 ,   board , word)){
                return true;
            }
             
        }
         board[i][j] = val;
              return false;
    }


    public boolean exist(char[][] board, String word) {
        int n  =  board.length;
        int m = board[0].length;

    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            if(board[i][j] == word.charAt(0) && get(i, j, 0,   board , word)){
                return true;
            }

        }
    }
    return false;
    
    }
}