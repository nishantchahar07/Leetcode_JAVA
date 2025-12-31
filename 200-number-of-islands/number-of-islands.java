class Solution {
    public void dfs(char[][] grid , int i ,  int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        //selfwork --> works as visited array 
        grid[i][j] = '0';

        //now check in all four direction 
        dfs(grid , i+1 , j);
        dfs(grid , i-1 , j);
        dfs(grid , i , j+1);
        dfs(grid , i , j-1);



    }
    public int numIslands(char[][] grid) {
        // two ways to do --> convert the grid into list of list  or apply traversal as it is ...

        //edge  case 
        if(grid == null || grid.length == 0 || grid[0].length == 0)return 0;
        int m = grid.length;
        int n =  grid[0].length;
        int count = 0;
       for(int i = 0 ; i < m ;i++ ){
        for(int j = 0 ; j < n ; j++){
            if(grid[i][j] == '1'){
            dfs(grid , i , j);
            count++;
            }
            
        }
       }
       
        return count;
        
    }
}