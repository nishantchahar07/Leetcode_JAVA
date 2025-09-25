class Solution {
    public void swap(int[] arr , int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] =  arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] arr) {
    //approach --> transpose then rotate each row;
    int m  =  arr.length;
    int n =  arr[0].length;
    for(int i = 0 ; i < m ; i++ ){
        for(int j = i ; j < n ; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] =  temp;
        }
    }
    for(int i = 0 ; i < n ; i++){
        swap(arr[i] , 0 , arr.length - 1);
    }
   
    }
}