class Solution {
    public int trap(int[] arr) {
        int n =  arr.length;
        int [] pre =  new int[n];
        int [] suf =  new int[n];
         int ans = 0;       
        pre[0] = arr[0];
        suf[n-1] =  arr[n-1];
        for(int i = 1 ; i < n ; i++){
        if(arr[i] > pre[i-1]){
            pre[i] = arr[i];

       }
       else{
        pre[i] = pre[i-1];
       } 
                
       
       
       }
       
        for(int i = n-2 ; i >= 0 ; i--){
        if(arr[i] > suf[i+1]){
            suf[i] = arr[i];

       }
       else{
        suf[i] = suf[i+1];
       } 
        }
      
    
       for(int k =0 ; k < n ; k++){
          ans += Math.min(pre[k] ,  suf[k]) - arr[k];
       }
                
       
       
       
       
        return ans;
    }
}