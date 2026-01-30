class Solution {
    public boolean get(char[][] board, String word ,  int i ,  int  j , int idx){
         if(idx ==  word.length())return true ;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '%'){
            return false;
        }
       
        if(board[i][j] != word.charAt(idx))return false;
        char val = board[i][j];
        board[i][j] = '%';

        int[][]  dir  = {{1,0} , {0, 1} , {-1, 0} , {0,-1}};
        for(int[] arr :  dir){
           int  new_i = i + arr[0];
           int  new_j = j + arr[1];       
            if(get(board  ,  word  ,new_i  ,new_j , idx+1))return true ;
        }

         board[i][j] =  val ;
         return false;
          
        
        
    }
      public boolean exist(char[][] board, String word) {
       int n =  board.length;
       int m =  board[0].length;
       for(int i = 0 ; i < n ; i++){
        for(int  j = 0 ; j < m ; j++){
            if(board[i][j] == word.charAt(0) && get(board  ,  word  , i , j , 0)){
                return true;
            }
        }
       }
       return false; 
    }
}