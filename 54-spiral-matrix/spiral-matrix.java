class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll =  new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int sc = 0;
        int sr = 0;
        int er = m-1;
        int ec =  n-1;
        int count = m*n;
        int val = 0;
while (sc <= ec && sr <= er){
        for(int i = sc ; i <= ec && val < count ; i++){
            ll.add(matrix[sr][i]);
            val++;
        }
        sr++;

         for(int i = sr ; i <= er && val < count ; i++){
            ll.add(matrix[i][ec]);
            val++;
        }ec--;


         for(int i = ec ; i >= sc && val < count ; i--){
            ll.add(matrix[er][i]);
            val++;
        }er--;

         for(int i = er ; i >= sr && val < count ; i--){
            ll.add(matrix[i][sc]);
            val++;
        } sc++;
}
return ll ;    }
}