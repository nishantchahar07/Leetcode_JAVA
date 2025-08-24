class Solution {
    public int countPrimes(int n) {
        boolean[] arr =  new boolean[n];
        for(int i = 2 ; i*i < n ; i++){
            if(arr[i] == false){ 
            for(int j = 2 ; j*i < n ;j++ ){
                arr[j*i] = true;
            }
            
        }
        }

        int count = 0;
        for(int i = 2 ; i < n ;i++){
            if (arr[i] == false)count++;
        }
        return count;
    }
}