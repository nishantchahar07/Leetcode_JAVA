class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        if(n <= 2 )return 0;
        if(n < 3) return n-1;
    
    for(int i =  2 ; i*i < n ; i++){
        for(int j = 2 ; i*j < n ; j++){
            arr[i*j] = true;
        }

    }
    int count = 0;
    for(int i = 2 ; i < arr.length ; i++){
        if(!arr[i]){
            count++;
        }

    }
        return count;
    }
}