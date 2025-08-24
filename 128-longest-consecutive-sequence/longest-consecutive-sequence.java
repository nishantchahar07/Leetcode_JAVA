class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int n =  arr.length;
        if(n == 0 || n == 1 )return n;
        int ans = 1;
        int prev = arr[0];
        int count = 1;
        for(int i = 1; i < n ; i++ ){
                

            if(arr[i] == prev)continue;
            else if(arr[i] == prev + 1){
                count++;
                
            }
            else{
                ans = Math.max(count , ans);
                count = 1;

            }
            prev = arr[i];
        }
        return ans = Math.max(ans  , count);
    }
}