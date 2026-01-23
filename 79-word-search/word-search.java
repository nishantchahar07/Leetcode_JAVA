class Solution {
    public boolean get(int i , int j , int idx , char[][] board, String word){
        if(word.length() == idx)return true;
        if(i >=  board.length || j >=  board[0].length || i < 0 || j  < 0 || word.charAt(idx) == '&')return false;
        if(board[i][j] !=  word.charAt(idx))return false;
        char ch =  board[i][j];
        board[i][j] = '&';
        int[][] dir =  {{1,0} , {-1,0} , {0,-1} , {0,1}};
        for(int [] arr : dir){
           int  new_i =  i + arr[0];
           int  new_j = j + arr[1];
           if( get(new_i , new_j , idx+1 ,  board ,  word))return true; 
         
        }
            board[i][j] = ch;
        return false ;
    }

    public boolean exist(char[][] board, String word) {    
     for(int i = 0 ; i < board.length ; i++){        
        for(int j = 0 ; j < board[0].length ; j++){
        if(board[i][j] ==  word.charAt(0) && get(i , j , 0,board ,  word)) 
        return true;
        }
     }
     return false;
    }
}